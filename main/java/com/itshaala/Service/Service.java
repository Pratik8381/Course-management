package com.itshaala.Service;

import com.itshaala.Dao.Dao;
import com.itshaala.Model.Model;

import java.sql.SQLException;
import java.util.List;

public class Service {
    Dao dao = new Dao();

    public void insert(Model model) throws SQLException {
        dao.insert(model);
    }

    public List<Model> printall() throws SQLException {
    return dao.printall();

    }

    public void delete(Model model) throws SQLException {
        dao.delete(model);

    }

    public boolean update(Model model) throws SQLException {
     return    dao.update(model);

    }
}
