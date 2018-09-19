package com.mycompany.recipeproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

    private Connection connection = null;

    //Constants
    private static final String IP       = "104.248.29.81";
    private static final String PORT     = "3306";
    public  static final String DATABASE = "recipeProject";
    private static final String USERNAME = "Michael";
    private static final String PASSWORD = "1997DueM1997DueM";

    public DBConnector() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
    }

    public Connection getConnection() {
        return this.connection;
    }
}