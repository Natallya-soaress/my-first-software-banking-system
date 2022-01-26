package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import View.Home;
import db.AccountDB;
import db.Conexao;

public class HomeController {
	private Home view;
	
	public HomeController(Home home) {
		this.view = view;
	}

	public String showNumber(String passwordAccount) throws SQLException{
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
		String number = novaCon.getnumberAccount(passwordAccount);
		return number;
	}
	
	public Double showBalance(String numberAccount) throws SQLException{
		
		//Verificar se existe do BD
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
		Double balance = novaCon.getBalance(numberAccount);
		return balance;
		
	}

}
