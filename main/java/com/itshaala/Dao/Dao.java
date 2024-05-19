package com.itshaala.Dao;

import com.itshaala.Model.Model;
import com.itshaala.Util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    public void insert(Model model) throws SQLException {
        try (Connection con = Util.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO `op`.`sarvelet` VALUES (?, ?, ?, ?, ?)")) {
            ps.setInt(1, model.getId());
            ps.setString(2, model.getPassword());
            ps.setString(3, model.getName());
            ps.setString(4, model.getAddress());
            ps.setString(5, model.getMobile_No());
            ps.executeUpdate();
            System.out.println("Record inserted successfully.");
        }
    }

    public List<Model> printall() throws SQLException {
        List<Model> modelList = new ArrayList<>();
        try (Connection connection = Util.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM `op`.`sarvelet`")) {
            while (resultSet.next()) {
                Model model = Model.builder()
                        .id(resultSet.getInt("id"))
                        .password(resultSet.getString("password"))
                        .name(resultSet.getString("name"))
                        .address(resultSet.getString("address"))
                        .mobile_No(resultSet.getString("mobile_No"))
                        .build();
                modelList.add(model);
            }
        }
        return modelList;
    }

    public void delete(Model model) throws SQLException {
        try (Connection con = Util.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM `op`.`sarvelet` WHERE id = ?")) {
            ps.setInt(1, model.getId());
            int deletedRows = ps.executeUpdate();
            if (deletedRows > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found for deletion.");
            }
        }
    }

    public boolean update(Model model) throws SQLException {
        try (Connection con = Util.getConnection();
             PreparedStatement ps = con.prepareStatement("UPDATE `op`.`sarvelet` SET password=?, name = ?, address = ?, mobile_No = ? WHERE id = ?")) {
            ps.setString(1, model.getPassword());
            ps.setString(2, model.getName() != null ? model.getName() : ""); // Handling possible null value for 'name'
            ps.setString(3, model.getAddress());
            ps.setString(4, model.getMobile_No());
            ps.setInt(5, model.getId());

            return ps.executeUpdate() > 0;
        }
    }

}
