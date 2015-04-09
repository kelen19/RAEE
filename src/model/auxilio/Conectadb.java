package model.auxilio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conectadb {

    Connection link = null;
    //nombre de la base de datos
    public String db = "Formularios.sqlite.sqlite";

    //URL del driver
    public String url = "jdbc:sqlite:" + db;

    //user de la bd
    public String user = "root";

    //pass del user de la bd
    public String pass = "123";

    public Connection Conectar() {

        try {

            Class.forName("org.sqlite.JDBC");

            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);

        }

        return link;

    }

}
