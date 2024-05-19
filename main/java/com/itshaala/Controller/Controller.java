package com.itshaala.Controller;

import com.itshaala.Model.Model;
import com.itshaala.Service.Service;

import java.sql.SQLException;
import java.util.List;

public class Controller {
    Service service = new Service();


    public void insert(Model model) throws SQLException {
        service.insert(model);
    }

    public List<Model> printall() throws SQLException {
      return  service.printall();

    }

    public void delete(Model model ) throws SQLException {
        service.delete(model);

    }

    public boolean update(Model model) throws SQLException {
      return   service.update(model);

    }
}
