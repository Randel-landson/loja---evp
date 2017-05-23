/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Evp.ConectaBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Landson
 */
public class ConexaoBanco {
    private static final String DRIVER = "com.jdbc.mysql.Driver";
    private static final String HOST = "jdbc:mysql://localhosta:3306/evp_veiculos";
    private static final String USER = "root";
    private static final String SENHA = "";
    
    
    public static Connection getConexao(){
    
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(HOST, USER, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("tipo do erro " + e);
            return null;
        }
    }
    
    public static void fecharConexao(Connection conexao){
    
    if(conexao != null){
        try {
            conexao.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }
    public static void fecharConexao(Connection conexao , PreparedStatement pst){
    
    if(pst != null){
        try {
            pst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        fecharConexao(conexao);
    }
    
    }
    public static void fecharConexao(Connection conexao , PreparedStatement pst , ResultSet rst){
    
    if(rst != null){
        try {
            rst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        fecharConexao(conexao , pst);
    }
    
    }
    
}
