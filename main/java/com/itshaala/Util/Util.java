package com.itshaala.Util;

import com.itshaala.Constants.Constants;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.Constants.Constants.MYSQL_DRIVER_CLASS;

public class Util {

@Getter
private static Connection connection;
static
{
    try {
        Class.forName(MYSQL_DRIVER_CLASS);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    try {
        connection = DriverManager.getConnection(Constants.URL,Constants.USERNAME,Constants.PASSWORD);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }


}
}
