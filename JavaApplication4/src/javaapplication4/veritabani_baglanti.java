/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ervas
 */
public class veritabani_baglanti {
    
    static String sql = "jdbc:postgresql://localhost:5432/bankayonetim";
    static Connection baglan = null;
    
    static void veritabani()
    { 
        try{
           
            baglan = DriverManager.getConnection(sql,"postgres","1234");
            System.out.println("bağlantı başarılı");
         
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        veritabani_baglanti.veritabani();
    }
   
}
