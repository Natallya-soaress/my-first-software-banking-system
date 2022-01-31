package Controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.exceptions.IncorrectPasswordException;
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

	public void autenticar() throws IncorrectPasswordException {
		
		//Buscar um usuário da view
		String numberAccount = view.getfieldAccountNumber().getText();
		String passwordAccount = view.getfieldAccountPasword().getText();
		Account user = new Account(numberAccount,passwordAccount);
		
		//Verificar se existe do BD
		Connection conexao = null;
		try {
			conexao = new Conexao().getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		AccountDB novaCon = new AccountDB(conexao);
       
        try {
			if (novaCon.existeUser(user)) {
				home = new Home();
				home.setNumberAccount(numberAccount);
				home.HomeTela(); //Dando update
				home.setVisible(true);
				view.setVisible(false);
			}else {
			    throw new IncorrectPasswordException("Number or Password invalid");
			}
		} catch (IncorrectPasswordException e) {
			JOptionPane.showMessageDialog(view,e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//conexao.close();
	}
	


	
}


