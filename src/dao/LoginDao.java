/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.imp.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class LoginDao {
    
    private final static Logger LOGGER = Logger.getLogger(LoginDao.class.getName());

    public boolean loginDBcontrol(String username, String password){

        boolean success = false;

        MyConnection connection = new MyConnection();

        try (Connection con = connection.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM uye WHERE email = '"
                    + username + "'");
            while (rs.next()) {
                System.out.println(rs.getString("password"));
                success = password.equals(rs.getString("password"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }
}
