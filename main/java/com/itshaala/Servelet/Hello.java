package com.itshaala.Servelet;

import com.itshaala.Controller.Controller;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(value = "/hello",loadOnStartup = 1)
public class Hello implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("service");
PrintWriter out = servletResponse.getWriter();
out.println("Good morning"+ LocalDateTime.now());
    }


    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
System.out.println("destroy");
    }
}
