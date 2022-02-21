package org.eightychars.sandbox.spring_boot_auth_example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class SpringAuthExampleAuthProvider implements AuthenticationProvider {
    
    @Autowired
    AuthenticationEntryPoint entryPoint;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("authenticate");
		String userName = authentication.getName();
		// user jim is accepted without password
		if ("jim".equals(userName)) {
			UsernamePasswordAuthenticationToken t = new UsernamePasswordAuthenticationToken(authentication.getName(),
					authentication.getCredentials().toString(), Arrays.asList());
			return t;
		} else {
			throw new BadCredentialsException("Invalid credentials");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		System.out.println("supports");
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
