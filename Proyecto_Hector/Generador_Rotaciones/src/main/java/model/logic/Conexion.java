package main.java.model.logic;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static final String URL = "jdbc:mysql://127.0.0.1:3306/proyecto_final_bd?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "";

    public static Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña);

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }

        return conexion;
    }

}
