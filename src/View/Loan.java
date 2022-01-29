package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class Loan extends JFrame {

	private JPanel Loan;
	private JTextField fielAccountNumberLoan;
	private JTextField fieldValueLoan;
	private JPasswordField fieldPasswordLoan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loan frame = new Loan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Loan = new JPanel();
		Loan.setBackground(Color.PINK);
		Loan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Loan);
		Loan.setLayout(null);
		
		JLabel logoLoan = new JLabel("");
		logoLoan.setIcon(new ImageIcon(Loan.class.getResource("/ViewImages/pair-of-bills.png")));
		logoLoan.setBounds(0, 0, 56, 32);
		Loan.add(logoLoan);
		
		JLabel titleLoan = new JLabel("Loan");
		titleLoan.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleLoan.setBounds(187, 18, 70, 14);
		Loan.add(titleLoan);
		
		JLabel textAccountNumberLoan = new JLabel("Account number");
		textAccountNumberLoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textAccountNumberLoan.setBounds(124, 60, 108, 14);
		Loan.add(textAccountNumberLoan);
		
		fielAccountNumberLoan = new JTextField();
		fielAccountNumberLoan.setBounds(113, 80, 157, 20);
		Loan.add(fielAccountNumberLoan);
		fielAccountNumberLoan.setColumns(10);
		
		JLabel textValueLoan = new JLabel("Value");
		textValueLoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textValueLoan.setBounds(124, 111, 46, 14);
		Loan.add(textValueLoan);
		
		fieldValueLoan = new JTextField();
		fieldValueLoan.setBounds(113, 127, 157, 20);
		Loan.add(fieldValueLoan);
		fieldValueLoan.setColumns(10);
		
		JLabel textPasswordLoan = new JLabel("Password");
		textPasswordLoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPasswordLoan.setBounds(124, 158, 84, 14);
		Loan.add(textPasswordLoan);
		
		fieldPasswordLoan = new JPasswordField();
		fieldPasswordLoan.setBounds(113, 173, 157, 20);
		Loan.add(fieldPasswordLoan);
		
		JButton buttonConfirmLoan = new JButton("Confirm");
		buttonConfirmLoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonConfirmLoan.setBounds(215, 215, 89, 23);
		Loan.add(buttonConfirmLoan);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new Home().setVisible(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dispose(); 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(102, 216, 89, 23);
		Loan.add(btnNewButton);
	}

}
