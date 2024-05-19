package com.itshaala.Servelet;

import com.itshaala.Controller.Controller;
import com.itshaala.Model.Model;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/model/update")
public class Update_Model  extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int id = Integer.parseInt((String) servletRequest.getParameter("model_id"));
        String model_password = servletRequest.getParameter("model_password");
        String model_name = servletRequest.getParameter("model_name");
        String model_address= servletRequest.getParameter("model_address");
        String model_mobile_No =servletRequest.getParameter("model_mobile_No");
        Model model= Model.builder()
                .id(id)
                .password(model_password)
                .name(model_name)
                .mobile_No(model_mobile_No)
                .build();

        Controller controller=new Controller();
        try {
            controller.update(model);
            PrintWriter out=servletResponse.getWriter();
            out.println("Course deleted successfully");
        } catch (SQLException e) {
            throw new ServletException("Error while deleting course", e);
        }

    }
}
