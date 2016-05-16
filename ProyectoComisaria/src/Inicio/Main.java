package Inicio;

import Datos.JDBCDAO;
import Vista.Principal;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Principal principal = new Principal();
        principal.setVisible(true);
//        JDBCDAO dao = new JDBCDAO();
    }

}
