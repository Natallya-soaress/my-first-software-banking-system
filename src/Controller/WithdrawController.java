package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.factory.Account;
import View.Home;
import View.Withdraw;
import db.AccountDB;
import db.Conexao;

public class WithdrawController {
	private Withdraw view;
	private Home home;
	
	public WithdrawController(Withdraw view) {
		this.view = view;
	}
	
	public WithdrawController() {
		
	}

	public void makeWithdraw() throws SQLException {

		String accountNumber = view.getFieldAccountNumberWithdraw().getText();
		String value = view.getFieldValueWithdraw().getText();
		String password = view.getFieldPasswordWitdraw().getText();
		Account user = new Account(accountNumber,password);
		
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
		
		if(novaCon.existeUser(user)) {
			home = new Home();
			home.setNumberAccount(accountNumber);
			novaCon.removeValue(value,accountNumber);
			home.HomeTela(); 
			home.setVisible(true);
			view.setVisible(false);
		}else {
            JOptionPane.showMessageDialog(view,"Number or Password invalid");
        }
		
	}
}
