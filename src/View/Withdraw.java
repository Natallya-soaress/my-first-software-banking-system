package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import Controller.WithdrawController;
import Model.exceptions.IncorrectPasswordException;
import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.NegativeValueException;
import Model.exceptions.NoNumberException;

public class Withdraw extends JFrame {

	private JPanel Withdraw;
	private JTextField fieldAccountNumberWithdraw;
	private JTextField fieldValueWithdraw;
	private JPasswordField fieldPasswordWitdraw;
	private Home home;
	
	
	public JTextField getFieldValueWithdraw() {
		return fieldValueWithdraw;
	}

	public void setFieldValueWithdraw(JTextField fieldValueWithdraw) {
		this.fieldValueWithdraw = fieldValueWithdraw;
	}
	
	public JTextField getFieldAccountNumberWithdraw() {
		return fieldAccountNumberWithdraw;
	}

	public void setFieldAccountNumberWithdraw(JTextField fieldAccountNumberWithdraw) {
		this.fieldAccountNumberWithdraw = fieldAccountNumberWithdraw;
	}

	public JPasswordField getFieldPasswordWitdraw() {
		return fieldPasswordWitdraw;
	}

	public void setFieldPasswordWitdraw(JPasswordField fieldPasswordWitdraw) {
		this.fieldPasswordWitdraw = fieldPasswordWitdraw;
	}


	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Withdraw() {
		WithdrawController controller = new WithdrawController(this,home);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Withdraw = new JPanel();
		Withdraw.setBackground(Color.PINK);
		Withdraw.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Withdraw);
		Withdraw.setLayout(null);
		
		JLabel logoWitdraw = new JLabel("");
		logoWitdraw.setIcon(new ImageIcon(Withdraw.class.getResource("/ViewImages/pair-of-bills.png")));
		logoWitdraw.setBounds(0, 0, 54, 32);
		Withdraw.add(logoWitdraw);
		
		JLabel titleWithdraw = new JLabel("Withdraw");
		titleWithdraw.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleWithdraw.setBounds(174, 18, 91, 14);
		Withdraw.add(titleWithdraw);
		
		JLabel textAccountNumberWithdraw = new JLabel("Account number");
		textAccountNumberWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textAccountNumberWithdraw.setBounds(126, 55, 125, 14);
		Withdraw.add(textAccountNumberWithdraw);
		
		fieldAccountNumberWithdraw = new JTextField();
		fieldAccountNumberWithdraw.setBounds(118, 75, 147, 20);
		Withdraw.add(fieldAccountNumberWithdraw);
		fieldAccountNumberWithdraw.setColumns(10);
		
		JLabel textValueWithdraw = new JLabel("Value");
		textValueWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textValueWithdraw.setBounds(126, 106, 46, 14);
		Withdraw.add(textValueWithdraw);
		
		fieldValueWithdraw = new JTextField();
		fieldValueWithdraw.setBounds(118, 121, 147, 20);
		Withdraw.add(fieldValueWithdraw);
		fieldValueWithdraw.setColumns(10);
		
		JLabel textPasswordWitdraw = new JLabel("Password");
		textPasswordWitdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPasswordWitdraw.setBounds(126, 152, 74, 14);
		Withdraw.add(textPasswordWitdraw);
		
		fieldPasswordWitdraw = new JPasswordField();
		fieldPasswordWitdraw.setBounds(118, 167, 147, 20);
		Withdraw.add(fieldPasswordWitdraw);
		
		JButton buttonConfirmWitdraw = new JButton("Confirm");
		buttonConfirmWitdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.makeWithdraw();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NegativeValueException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IncorrectPasswordException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoNumberException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InsuficientBalanceException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonConfirmWitdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonConfirmWitdraw.setBounds(198, 209, 89, 23);
		Withdraw.add(buttonConfirmWitdraw);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(83, 209, 89, 23);
		Withdraw.add(btnNewButton);
	}


}
