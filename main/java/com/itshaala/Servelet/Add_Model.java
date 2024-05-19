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

@WebServlet("/model/add")
public class Add_Model extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String modelId = servletRequest.getParameter("model_id");
        String modelPassword = servletRequest.getParameter("model_password");
        String modelName = servletRequest.getParameter("model_name");
        String modelAddress = servletRequest.getParameter("model_address");
        String modelMobileNo = servletRequest.getParameter("model_mobile_No");

        Model model = new Model();
        model.setId(Integer.parseInt(modelId));
        model.setPassword(modelPassword);
        model.setName(modelName);
        model.setAddress(modelAddress);
        model.setMobile_No(modelMobileNo);

        Controller controller = new Controller();
        try {
            controller.insert(model);
            PrintWriter printWriter = servletResponse.getWriter();
            printWriter.println("Course added successfully");
        } catch (SQLException e) {
            throw new ServletException("Error while adding course", e);
        }
    }
}
