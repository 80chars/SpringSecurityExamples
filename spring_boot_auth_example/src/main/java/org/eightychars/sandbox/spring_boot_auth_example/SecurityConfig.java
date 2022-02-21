package org.eightychars.sandbox.spring_boot_auth_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private SpringAuthExampleAuthProvider  authenticationProvider;
	
	@Autowired
    private CustomAuthenticationEntryPoint authenticationEntryPoint;
    
    @Override
    protected void configure (AuthenticationManagerBuilder auth) throws Exception
    {
		System.out.println ("configure with MB");
    	auth.authenticationProvider(authenticationProvider);
    }
    
    protected void configure(HttpSecurity http) throws Exception
    {
		System.out.println ("configure");
    	http.formLogin();
    	http.authorizeHttpRequests().anyRequest().authenticated()
    	// provide our own entry point to handle 401 response
        .and()
        .httpBasic()
    	.authenticationEntryPoint(authenticationEntryPoint);
    }
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder ()
    {
		System.out.println ("password Encoder");
    	return new BCryptPasswordEncoder();
    }
}
