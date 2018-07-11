/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teman_nonton.model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ilham
 */
public class koneksi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/teman_nonton";
    static final String USER = "root";
    static final String PASS = "";

//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://sql306.epizy.com/epiz_22366359_teman_nonton";
//    static final String USER = "epiz_22366359";
//    static final String PASS = "ilhamilham17";    
    
    public static Connection koneksi_database(){
        
       try {
         Class.forName(JDBC_DRIVER);    
         Connection koneksi = DriverManager.getConnection(DB_URL,USER,PASS);
         return koneksi;
       }
       
       catch(Exception e){
         JOptionPane.showMessageDialog(null, e);  
         return null;
       }
    }    
}
