package com.itshaala.Servelet;

import com.itshaala.Controller.Controller;
import com.itshaala.Model.Model;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import lombok.SneakyThrows;



import java.io.PrintWriter;
import java.util.List;
@WebServlet("/model/Show")
public class GetAllCources extends HttpServlet
{



    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @SneakyThrows
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) {
        Controller controller = new Controller();
        List<Model> list =controller.printall();
        PrintWriter out = servletResponse.getWriter();
        out.println(list);
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
