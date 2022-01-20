package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel login;
	private JTextField fieldAccountNumber;
	private JPasswordField fieldAccountPasword;
	private JLabel logoLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		login = new JPanel();
		login.setBackground(Color.PINK);
		login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(login);
		login.setLayout(null);
		
		fieldAccountNumber = new JTextField();
		fieldAccountNumber.setBounds(105, 106, 174, 20);
		login.add(fieldAccountNumber);
		fieldAccountNumber.setColumns(10);
		
		JLabel textAccountNumber = new JLabel("Account number");
		textAccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textAccountNumber.setBounds(105, 87, 100, 14);
		login.add(textAccountNumber);
		
		fieldAccountPasword = new JPasswordField();
		fieldAccountPasword.setBounds(105, 155, 174, 20);
		login.add(fieldAccountPasword);
		
		JLabel textAccountPasword = new JLabel("Password");
		textAccountPasword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textAccountPasword.setBounds(105, 137, 79, 14);
		login.add(textAccountPasword);
		
		JButton buttonLogin2 = new JButton("Login");
		buttonLogin2.addActionListener(new ActionListener() {
			//Se clicar no botão de login, aparecerá a tela home
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				home.setVisible(true);
				dispose();
			}
		});
		buttonLogin2.setBackground(new Color(255, 0, 255));
		buttonLogin2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonLogin2.setBounds(190, 199, 89, 23);
		login.add(buttonLogin2);
		
		logoLogin = new JLabel("");
		logoLogin.setIcon(new ImageIcon(Login.class.getResource("/ViewImages/pair-of-bills.png")));
		logoLogin.setBounds(173, 24, 62, 45);
		login.add(logoLogin);
	}
}
