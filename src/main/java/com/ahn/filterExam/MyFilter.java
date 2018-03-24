package com.ahn.filterExam;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/testHello")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter!!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if(servletRequest instanceof HttpServletRequest){
            String url = ((HttpServletRequest) servletRequest).getRequestURI().toString();
            String queryString  = ((HttpServletRequest) servletRequest).getQueryString();
            System.out.println("url::"+url);
            System.out.println("url::"+queryString);
        }
        System.out.println("Do filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter!");
    }
}
