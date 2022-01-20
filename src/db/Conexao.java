package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
		public Connection getConnection() throws SQLException{	
			Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/POO","postgres","ccrcami");
			return conexao;
	}
}
	
	
