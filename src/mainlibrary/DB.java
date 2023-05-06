/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author bikash
 */
public class DB {

    public static String user = "root";
    public static String connection = "jdbc:mysql://127.0.0.1:3306/library?user=root&password=password&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Properties props = new Properties();
            props.put("user", user);
     //change the password to the password  ↓↓↓↓↓↓↓↓↓↓↓   you enteredwhen setting up mysql
            props.put("password", "root");
            props.put("useUnicode", "true");
            props.put("useServerPrepStmts", "false"); // use client-side prepared statement
            props.put("characterEncoding", "UTF-8"); // ensure charset is utf8 here

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connection, props);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
