package com.spendwiseduo.pft.util;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DatabaseUtil {
    private DatabaseUtil() { }
    /**
    * Database location.
    */
    private static final String URL =
        "jdbc:h2:./src/main/resources/database/db";
    /**
    * Database's Username.
    */
    private static final String USER = "sa";
    /**
    * Database's Password.
    */
    private static final String PASSWORD = "";
    /**
    * initialize database connection.
    * @return connected Connection or Error if failed to connect
    */
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}
