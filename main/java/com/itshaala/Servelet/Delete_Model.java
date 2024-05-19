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

@WebServlet("/model/delete")
public class Delete_Model extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int id = Integer.parseInt(servletRequest.getParameter("model_id"));
        Model model = Model.builder()
                .id(id)
                .build();
        Controller controller = new Controller();
        try {
            controller.delete(model);
            PrintWriter printWriter = servletResponse.getWriter();
            printWriter.println("Course deleted successfully");
        } catch (SQLException e) {
            throw new ServletException("Error while deleting course", e);
        }
    }
}
