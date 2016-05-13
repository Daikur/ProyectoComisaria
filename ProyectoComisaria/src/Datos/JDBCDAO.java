/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Multa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDAO {

    Connection conexion;
    static String bd = "Comisaria";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;

    public JDBCDAO() throws SQLException {
        conexion = DriverManager.getConnection(url, login, password);
        if (conexion != null) {

        }
    }

    public boolean introducirMulta(Multa m) throws SQLException {
        boolean resultado = false;

//                PreparedStatement ps = conn.prepareStatement(consulta);
        //INSERT
        String sql = "INSERT INTO comisaria (id,descripcion,fecha,importe,idpolicia,nifinfractor,idtipo) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement psInsertarMultas = conexion.prepareStatement(sql);

        psInsertarMultas.setInt(1, m.getId());
        psInsertarMultas.setString(2, m.getDescripcion());
        psInsertarMultas.setDate(3, m.getFecha());
        psInsertarMultas.setDouble(4, m.getImporte());
        psInsertarMultas.setInt(5, m.getIdpolicia());
        psInsertarMultas.setInt(6, m.getIdtipo());
//                
        int numFilas = psInsertarMultas.executeUpdate();
        if (numFilas != 0 ){
            resultado = true;
        }
        return resultado;

    }
}
