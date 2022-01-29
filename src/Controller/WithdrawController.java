package Controller;

import java.awt.HeadlessException;
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
import View.Login;
import View.Withdraw;
import db.AccountDB;
import db.Conexao;
import Controller.HomeController;

public class WithdrawController {
	private Withdraw view;
	private Home home;
	private Login login;
	
	public WithdrawController(Withdraw view) {
		this.view = view;
		
	}
	public WithdrawController(Withdraw view,Home home) {
		this.view = view;
		this.home = home;
		
	}
	public WithdrawController() {
		
	}


	public void makeWithdraw() throws SQLException,NegativeValueException,IncorrectPasswordException,NoNumberException,InsuficientBalanceException{// {
		try {
			String accountNumber = view.getFieldAccountNumberWithdraw().getText();
			String value = view.getFieldValueWithdraw().getText();
			String password = view.getFieldPasswordWitdraw().getText();
			
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
			Connection conexao = new Conexao().getConnection();
			AccountDB novaCon = new AccountDB(conexao);
			try {
				if(novaCon.existeUser(user)) {
					home = new Home();
					home.setNumberAccount(accountNumber);
					novaCon.removeValue(value,accountNumber);
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
			}catch(Exception e) {
				JOptionPane.showMessageDialog(view,"The value has to be a number");
			}
	}
}
