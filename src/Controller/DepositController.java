package Controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.exceptions.IncorrectAccountException;
import Model.exceptions.IncorrectPasswordException;
import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.NegativeValueException;
import Model.factory.Account;
import View.Deposit;
import View.Home;
import View.Login;
import db.AccountDB;
import db.Conexao;

public class DepositController {
	private Deposit view;
	private Home home;
	private Login login;
	

	public DepositController(Deposit view) {
		this.view = view;
	}
	
	public DepositController() {
		
	}

	public void makeDeposit() throws IncorrectPasswordException,NegativeValueException, HeadlessException, SQLException {
		try {
			String accountNumber = view.getFieldAccountNumberDeposit().getText();
			String value = view.getFieldValueDeposit().getText();
			String password = view.getFieldPasswordDeposit().getText();
			
			
			Double number = Double.valueOf(value).doubleValue();
			if(!(accountNumber.equals(home.getNumberAccount()))) {
				throw new IncorrectAccountException("The user is not the login user");
			}
			if(Double.valueOf(value).doubleValue() < 0) {
				throw new NegativeValueException("The value cannot be negative.");
			}
			Account user = new Account(accountNumber,password);
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
					home.setNumberAccount(accountNumber);
					novaCon.addValue(value,accountNumber);
					home.HomeTela(); 
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
		}catch(NegativeValueException e) {
			JOptionPane.showMessageDialog(view,e.getMessage());
		}catch(IncorrectAccountException e) {
			JOptionPane.showMessageDialog(view,e.getMessage());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(view,"The value has be a number");
		}
		
		
	}
}
