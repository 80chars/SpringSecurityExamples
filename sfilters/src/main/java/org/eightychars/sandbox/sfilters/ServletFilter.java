package org.eightychars.sandbox.sfilters;


import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class ServletFilter  extends GenericFilterBean  {
   @Override
   public void destroy() {}

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) 
      throws IOException, ServletException {
      System.out.println("servlet filter");
      System.out.println("Remote Host:"+request.getRemoteHost());
      System.out.println("Remote Address:"+request.getRemoteAddr());
      filterchain.doFilter(request, response);
   }

}