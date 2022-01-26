package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.factory.Account;
import View.Deposit;
import View.Home;
import db.AccountDB;
import db.Conexao;

public class DepositController {
	private Deposit view;
	private Home home;
	

	public DepositController(Deposit view) {
		this.view = view;
	}
	
	public DepositController() {
		
	}

	public void makeDeposit() throws SQLException {
		
		String accountNumber = view.getFieldAccountNumberDeposit().getText();
		String value = view.getFieldValueDeposit().getText();
		String password = view.getFieldPasswordDeposit().getText();
		Account user = new Account(accountNumber,password);
		
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
		
		if(novaCon.existeUser(user)) {
			home = new Home();
			home.setNumberAccount(accountNumber);
			novaCon.addValue(value,accountNumber);
			home.HomeTela(); 
			home.setVisible(true);
			view.setVisible(false);
		}else {
            JOptionPane.showMessageDialog(view,"Number or Password invalid");
        }
		
		//view.setVisible(false);
		//home.setVisible(true);
		
		
		
		
	}
}
