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
    private String nombrePolicia, numplacaPolicia;

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

//      PreparedStatement ps = conn.prepareStatement(consulta);
        //INSERT
        String sql = "INSERT INTO comisaria (descripcion,importe,idpolicia,nifinfractor,idtipo) VALUES (?,?,?,?,?)";
        PreparedStatement psInsertarMultas = conexion.prepareStatement(sql);
//        psInsertarMultas.setInt(1, m.getId());
        psInsertarMultas.setString(1, m.getDescripcion());
//        psInsertarMultas.setDate(2, "2016/05/16");
        psInsertarMultas.setDouble(2, m.getImporte());
        psInsertarMultas.setInt(3, this.extraerIdPolicia(this.nombrePolicia, this.numplacaPolicia));
        psInsertarMultas.setString(4, m.getNifinfractor());
        psInsertarMultas.setInt(5, m.getIdtipo());

        int numFilas = psInsertarMultas.executeUpdate();
        if (numFilas != 0) {
            resultado = true;
        }
        return resultado;

    }

    public List<String> consultarIDPolicia() throws SQLException {
        List<String> listaPolicias = new ArrayList<>();
        String nombre, numplaca;
        String sql = "Select nombre, numplaca from policia";
        PreparedStatement psSelectPolicia = conexion.prepareStatement(sql);

        ResultSet rs = psSelectPolicia.executeQuery();

        nombre = rs.getString("nombre");
        numplaca = rs.getString("nurmplaca");

        while(rs.next()){
            listaPolicias.add(nombre + " - " + numplaca);
        }

        return listaPolicias;
    }

    public List<Integer> consultarTipo() throws SQLException {
        List<Integer> listaTipo = new ArrayList<>();
        Integer num;
        String sql = "Select Distinct(idtipo) from multas";
        PreparedStatement psSelectPolicia = conexion.prepareStatement(sql);

        ResultSet rs = psSelectPolicia.executeQuery();

        while (rs.next()) {
            num = rs.getInt("idtipo");
            listaTipo.add(num);
        }
        return listaTipo;

    }

    public Integer extraerIdPolicia(String nombre, String numplaca) throws SQLException {
        Integer idPolicia = 0;
        String sql = "Select idpolicia from policias where nombre = ? and numplaca = ?";
        PreparedStatement psExtraerPolicia = conexion.prepareStatement(sql);
        psExtraerPolicia.setString(1, nombre);
        psExtraerPolicia.setString(2, numplaca);

        ResultSet rs = psExtraerPolicia.executeQuery();

        idPolicia = rs.getInt("idPolicia");

        return idPolicia;
    }

}
