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
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AccountStatement extends JFrame {

	private JPanel accountStatement;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountStatement frame = new AccountStatement();
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
	public AccountStatement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		accountStatement = new JPanel();
		accountStatement.setBackground(Color.PINK);
		accountStatement.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(accountStatement);
		accountStatement.setLayout(null);

		JLabel logoStatement = new JLabel("");
		logoStatement.setIcon(new ImageIcon(AccountStatement.class.getResource("/ViewImages/pair-of-bills.png")));
		logoStatement.setBounds(0, 0, 66, 32);
		accountStatement.add(logoStatement);

		JLabel lblNewLabel = new JLabel("Account Statement");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(132, 28, 184, 14);
		accountStatement.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 70, 172, 146);
		accountStatement.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
	}
}