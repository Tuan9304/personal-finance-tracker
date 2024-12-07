package com.spendwiseduo.pft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class UserDatabaseUtil {
    private UserDatabaseUtil() {}

    /**
     * initialize database connection.
     *
     * @return connected Connection or throw an error if failed to connect
     */
    public static Connection connect(String userId, String password) throws SQLException {
        String url = "jdbc:h2:./src/main/resources/database/user_" + userId;

        return DriverManager.getConnection(url, userId, password);
    }
}
