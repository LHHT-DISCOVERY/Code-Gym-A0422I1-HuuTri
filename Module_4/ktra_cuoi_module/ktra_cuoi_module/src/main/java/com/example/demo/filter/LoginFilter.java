package com.example.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Component
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest request1 = (HttpServletRequest)request;
//        HttpServletResponse response1 = (HttpServletResponse) response;
//        String path = ((HttpServletRequest) request).getServletPath();
//        HttpSession session = request1.getSession();
//        String user = (String) session.getAttribute("username");
//        if(path.contains("/login") || path.contains("/list") || path.contains("static")){
//            chain.doFilter(request,response);
//        }
//        else if(user==null){
//            response1.sendRedirect("/login");
//        }else {
            chain.doFilter(request,response);
//        }
    }

    @Override
    public void destroy() {

    }
}
