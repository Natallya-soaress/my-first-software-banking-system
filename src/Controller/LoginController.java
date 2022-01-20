package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JTextField;

import Model.entities.Account;
import View.Home;
import View.Login;
import db.AccountDB;
import db.Conexao;

public class LoginController {
	private Login view;
	
	public LoginController(Login view) {
		this.view = view;
	}

	public void autenticar() throws Exception {
		
		//Buscar um usuário da view
		String numberAccount = view.getfieldAccountNumber().getText();
		String passwordAccount = view.getfieldAccountPasword().getText();
		Account user = new Account(numberAccount,passwordAccount);
		
		//Verificar se existe do BD
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
		
		novaCon.existeUser(user);
		//Connection conexao = new Conexao().getConnection();
		
		Home home = new Home();
		home.setVisible(true);
		
		
	}

	
}


