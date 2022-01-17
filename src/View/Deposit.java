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
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {

	private JPanel deposit;
	private JTextField fieldAccountNumberDeposit;
	private JTextField fieldValueDeposit;
	private JPasswordField fieldPasswordDeposit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
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
	public Deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		deposit = new JPanel();
		deposit.setBackground(Color.PINK);
		deposit.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(deposit);
		deposit.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Deposit.class.getResource("/ViewImages/pair-of-bills.png")));
		lblNewLabel.setBounds(0, 0, 60, 32);
		deposit.add(lblNewLabel);
		
		JLabel textAccountNumberDeposit = new JLabel("Account Number");
		textAccountNumberDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textAccountNumberDeposit.setBounds(136, 56, 107, 14);
		deposit.add(textAccountNumberDeposit);
		
		fieldAccountNumberDeposit = new JTextField();
		fieldAccountNumberDeposit.setBounds(125, 72, 133, 20);
		deposit.add(fieldAccountNumberDeposit);
		fieldAccountNumberDeposit.setColumns(10);
		
		JLabel textValueDeposit = new JLabel("Value");
		textValueDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textValueDeposit.setBounds(135, 103, 46, 14);
		deposit.add(textValueDeposit);
		
		fieldValueDeposit = new JTextField();
		fieldValueDeposit.setBounds(125, 121, 133, 20);
		deposit.add(fieldValueDeposit);
		fieldValueDeposit.setColumns(10);
		
		JLabel textPasswordDeposit = new JLabel("Password");
		textPasswordDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPasswordDeposit.setBounds(135, 152, 79, 14);
		deposit.add(textPasswordDeposit);
		
		JLabel titleDeposit = new JLabel("Deposit");
		titleDeposit.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleDeposit.setBounds(174, 12, 69, 20);
		deposit.add(titleDeposit);
		
		JButton buttonConfirm = new JButton("Confirm");
		buttonConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Adicionar um evento ao botão
			}
		});
		buttonConfirm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonConfirm.setBounds(169, 209, 89, 23);
		deposit.add(buttonConfirm);
		
		fieldPasswordDeposit = new JPasswordField();
		fieldPasswordDeposit.setBounds(128, 167, 130, 20);
		deposit.add(fieldPasswordDeposit);
	}

}
