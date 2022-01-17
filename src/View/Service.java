package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Label;

public class Service extends JFrame {

	private JPanel Service;
	private Button buttonSend;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Service frame = new Service();
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
	public Service() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Service = new JPanel();
		Service.setBackground(Color.PINK);
		Service.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Service);
		Service.setLayout(null);
		
		JLabel logoService = new JLabel("");
		logoService.setIcon(new ImageIcon(Service.class.getResource("/ViewImages/pair-of-bills.png")));
		logoService.setBounds(0, 0, 56, 32);
		Service.add(logoService);
		
		JMenu menuActionService = new JMenu("Desired action");
		menuActionService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuActionService.setBounds(-23, 97, 133, 26);
		Service.add(menuActionService);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Complaint");
		rdbtnmntmNewRadioItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuActionService.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Praise");
		rdbtnmntmNewRadioItem_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuActionService.add(rdbtnmntmNewRadioItem_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("Query");
		menuActionService.add(rdbtnmntmNewRadioItem_2);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(211, 117, 174, 94);
		Service.add(textArea);
		
		buttonSend = new Button("Send");
		buttonSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonSend.setBounds(315, 217, 70, 22);
		Service.add(buttonSend);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(211, 11, 46, 14);
		Service.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(211, 26, 174, 20);
		Service.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(211, 52, 46, 14);
		Service.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 67, 174, 20);
		Service.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Action");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(211, 97, 46, 14);
		Service.add(lblNewLabel_2);
		
		Label titleService = new Label("Service");
		titleService.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleService.setBounds(51, 44, 62, 22);
		Service.add(titleService);
	}
}
