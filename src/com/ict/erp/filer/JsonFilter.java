package com.ict.erp.filer;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/json/*")
public class JsonFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest)request;
		Enumeration<String> headerNames = req.getHeaderNames();
		
		String contentType = req.getHeader("content-type");
		String method = req.getMethod();
		
		if(contentType!=null) {
			System.out.println("contentType : " + contentType);
			System.out.println("method : " + method);
		}
		/*while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String header = req.getHeader(headerName);
			System.out.println(headerName + " : " + header);
		}
		*/
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
