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

import Controller.TransferController;

public class Transfer extends JFrame {

	private JPanel Transfer;
	private JTextField fieldSourceTransfer;
	private JTextField fieldDestinationTransfer;
	private JTextField fieldValueTransfer;
	private JPasswordField fieldPasswordTransfer;
	
	
	public JTextField getFieldSourceTransfer() {
		return fieldSourceTransfer;
	}

	public void setFieldSourceTransfer(JTextField fieldSourceTransfer) {
		this.fieldSourceTransfer = fieldSourceTransfer;
	}

	public JTextField getFieldDestinationTransfer() {
		return fieldDestinationTransfer;
	}

	public void setFieldDestinationTransfer(JTextField fieldDestinationTransfer) {
		this.fieldDestinationTransfer = fieldDestinationTransfer;
	}

	public JTextField getFieldValueTransfer() {
		return fieldValueTransfer;
	}

	public void setFieldValueTransfer(JTextField fieldValueTransfer) {
		this.fieldValueTransfer = fieldValueTransfer;
	}

	public JPasswordField getFieldPasswordTransfer() {
		return fieldPasswordTransfer;
	}

	public void setFieldPasswordTransfer(JPasswordField fieldPasswordTransfer) {
		this.fieldPasswordTransfer = fieldPasswordTransfer;
	}



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transfer frame = new Transfer();
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
	public Transfer() {
		TransferController controller = new TransferController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Transfer = new JPanel();
		Transfer.setBackground(Color.PINK);
		Transfer.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Transfer);
		Transfer.setLayout(null);
		
		JLabel logoLoan = new JLabel("");
		logoLoan.setIcon(new ImageIcon(Transfer.class.getResource("/ViewImages/pair-of-bills.png")));
		logoLoan.setBounds(0, 0, 55, 32);
		Transfer.add(logoLoan);
		
		JLabel titleTrasnfer = new JLabel("Transfer");
		titleTrasnfer.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleTrasnfer.setBounds(158, 18, 102, 14);
		Transfer.add(titleTrasnfer);
		
		JLabel textSourceTransfer = new JLabel("Source");
		textSourceTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textSourceTransfer.setBounds(86, 68, 46, 14);
		Transfer.add(textSourceTransfer);
		
		fieldSourceTransfer = new JTextField();
		fieldSourceTransfer.setBounds(86, 85, 107, 20);
		Transfer.add(fieldSourceTransfer);
		fieldSourceTransfer.setColumns(10);
		
		JLabel textDestinationTransfer = new JLabel("Destionation");
		textDestinationTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textDestinationTransfer.setBounds(224, 68, 92, 14);
		Transfer.add(textDestinationTransfer);
		
		fieldDestinationTransfer = new JTextField();
		fieldDestinationTransfer.setBounds(224, 85, 107, 20);
		Transfer.add(fieldDestinationTransfer);
		fieldDestinationTransfer.setColumns(10);
		
		JLabel textValueTransfer = new JLabel("Value");
		textValueTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textValueTransfer.setBounds(86, 116, 46, 14);
		Transfer.add(textValueTransfer);
		
		fieldValueTransfer = new JTextField();
		fieldValueTransfer.setBounds(86, 131, 136, 20);
		Transfer.add(fieldValueTransfer);
		fieldValueTransfer.setColumns(10);
		
		JLabel textPasswordTransfer = new JLabel("Password");
		textPasswordTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPasswordTransfer.setBounds(86, 162, 83, 14);
		Transfer.add(textPasswordTransfer);
		
		fieldPasswordTransfer = new JPasswordField();
		fieldPasswordTransfer.setBounds(86, 176, 136, 20);
		Transfer.add(fieldPasswordTransfer);
		
		JButton buttonConfirmTransfer = new JButton("Confirm");
		buttonConfirmTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					controller.makeTransfer();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonConfirmTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonConfirmTransfer.setBounds(227, 206, 89, 23);
		Transfer.add(buttonConfirmTransfer);
		
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
		btnNewButton.setBounds(96, 206, 89, 23);
		Transfer.add(btnNewButton);
	}

}
