/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDAO {

    Connection conexion;
    static String bd = "Comisaria";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;

    public boolean crearConexion() {
        boolean resultado = false;

        try {
            conexion = DriverManager.getConnection(url, login, password);
            if (conexion != null) {
                resultado = true;

            }
        } catch (SQLException ex) {

        }
        return resultado;
    }
}
