package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.factory.Account;
import View.Home;
import View.Login;
import db.AccountDB;
import db.Conexao;

public class LoginController {
	private Login view;
	private Home home;
	
	public LoginController(Login view) {
		this.view = view;
	}
	public LoginController() {
		
	}

	public void autenticar() throws Exception {
		
		//Buscar um usuário da view
		String numberAccount = view.getfieldAccountNumber().getText();
		String passwordAccount = view.getfieldAccountPasword().getText();
		Account user = new Account(numberAccount,passwordAccount);
		
		//Verificar se existe do BD
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
       
        if (novaCon.existeUser(user)) {
        	home = new Home();
        	home.setNumberAccount(numberAccount);
        	home.HomeTela(); //Dando update
        	home.setVisible(true);
        	view.setVisible(false);
        	
        	
        }else {
            JOptionPane.showMessageDialog(view,"Number or Password invalid");
        }
		
		//conexao.close();
	}
	


	
}


