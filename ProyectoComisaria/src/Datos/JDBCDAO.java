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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "INSERT INTO comisaria (descripcion,fecha,importe,idpolicia,nifinfractor,idtipo) VALUES (?,2016/05/16,?,?,?,?)";
        PreparedStatement psInsertarMultas = conexion.prepareStatement(sql);
//        psInsertarMultas.setInt(1, m.getId());
        psInsertarMultas.setString(1, m.getDescripcion());
//        psInsertarMultas.setDate(2, "2016/05/16");
        psInsertarMultas.setDouble(3, m.getImporte());
        psInsertarMultas.setString(4, m.getIdPolicia().toString());
        psInsertarMultas.setInt(5, m.getIdtipo());

        int numFilas = psInsertarMultas.executeUpdate();
        if (numFilas != 0) {
            resultado = true;
        }
        return resultado;

    }

    public List<String> consultarIDPolicia() throws SQLException {
        List<String> listaPolicia = new ArrayList<>();
        String nombre, numplaca;
        String sql = "Select nombre, numplaca from policia";
        PreparedStatement psSelectPolicia = conexion.prepareStatement(sql);

        ResultSet rs = psSelectPolicia.executeQuery();

        while (rs.next()) {
            nombre = rs.getString("nombre");
            numplaca = rs.getString("numplaca");
//            System.out.println(nombre + " " + numplaca);
            listaPolicia.add(nombre);
        }
        return listaPolicia;
    }
}
