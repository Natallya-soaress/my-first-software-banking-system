package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.factory.Account;
import View.Home;
import View.Transfer;
import db.AccountDB;
import db.Conexao;

public class TransferController {
	private Transfer view;
	private Home home;
	
	
	public TransferController(Transfer view) {
		this.view = view;
	}
	
	public TransferController() {
		
	}

	public void makeTransfer() throws SQLException {
		
		String accountNumber = view.getFieldSourceTransfer().getText();
		String value = view.getFieldValueTransfer().getText();
		String password = view.getFieldPasswordTransfer().getText();
		String destination = view.getFieldDestinationTransfer().getText();
		Account user = new Account(accountNumber,password);
		Account userDestionation = new Account(destination);
		
		Connection conexao = new Conexao().getConnection();
		AccountDB novaCon = new AccountDB(conexao);
		AccountDB novaCon2 = new AccountDB(conexao);
		
		if(novaCon.existeUser(user) && novaCon2.existeUserDestination(userDestionation)) { 
			home = new Home();
			home.setNumberAccount(accountNumber);
			novaCon.transferValue(value,accountNumber,destination);
			home.HomeTela(); 
			home.setVisible(true);
			view.setVisible(false);
		}else {
            JOptionPane.showMessageDialog(view,"Number or Password invalid");
        }
		
		
		
		
	}

}
