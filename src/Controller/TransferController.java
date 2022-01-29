package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.exceptions.IncorrectAccountException;
import Model.exceptions.IncorrectPasswordException;
import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.NegativeValueException;
import Model.exceptions.NoNumberException;
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

	public void makeTransfer() throws SQLException,IncorrectPasswordException,InsuficientBalanceException,NegativeValueException,NoNumberException {
		try {
			String accountNumber = view.getFieldSourceTransfer().getText();
			String value = view.getFieldValueTransfer().getText();
			String password = view.getFieldPasswordTransfer().getText();
			String destination = view.getFieldDestinationTransfer().getText();

			Double newValue = Double.valueOf(value).doubleValue();
			if(!(accountNumber.equals(home.getNumberAccount()))) {
				throw new IncorrectAccountException("The user is not the login user");
			}
			if(newValue > home.getBalance()) {
				throw new InsuficientBalanceException("The value is more than you have.");
			}
			if(Double.valueOf(value).doubleValue() < 0) {
				throw new NegativeValueException("You can't withdraw a negative value");
			}
			Account user = new Account(accountNumber,password);
			Account userDestionation = new Account(destination);
			Connection conexao = new Conexao().getConnection();
			AccountDB novaCon = new AccountDB(conexao);
			AccountDB novaCon2 = new AccountDB(conexao);
			
			try {
				if(novaCon.existeUser(user) && novaCon2.existeUserDestination(userDestionation)) { 
					home = new Home();
					home.setNumberAccount(accountNumber);
					novaCon.transferValue(value,accountNumber,destination);
					home.HomeTela(); 
					home.setVisible(true);
					view.setVisible(false);
				}else {
					throw new IncorrectPasswordException("Number or Password invalid");
		        }
			}catch(IncorrectPasswordException e) {
				JOptionPane.showMessageDialog(view,e.getMessage());
			}
			
			}catch(NegativeValueException e) {
				JOptionPane.showMessageDialog(view,e.getMessage());
			}catch(InsuficientBalanceException e) {
					JOptionPane.showMessageDialog(view,e.getMessage());
			}catch(IncorrectAccountException e) {
				JOptionPane.showMessageDialog(view,e.getMessage());
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(view,"The value has to be a number");
			}
	}
		


		
		
		
		
	}


