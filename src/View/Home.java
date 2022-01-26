package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.HomeController;
import Controller.LoginController;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JMenuItem;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel home;
	//private final HomeController controller;
	private JLabel accountNumberUser;
	private JLabel balanceUser;
	private String numberAccount;
	



	public String getNumberAccount() {
		return numberAccount;
	}
	public void setNumberAccount(String numberAccount) {
		
		this.numberAccount = numberAccount;
		//System.out.println(this.getNumberAccount());
	}
	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public Home() throws SQLException {
		HomeTela();
		
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public void HomeTela() throws SQLException {
		//this.controller = null;
		HomeController controller = new HomeController(this);
		LoginController controller2 = new LoginController();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 324);
		home = new JPanel();
		home.setBackground(Color.PINK);
		home.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(home);
		home.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 426, 22);
		home.add(menuBar);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenuItem menuSettings = new JMenuItem("Settings");
		mnSettings.add(menuSettings);
		menuSettings.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/gear.png")));
		menuSettings.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		mnExit.add(menuExit);
		menuExit.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/exit.png")));
		menuExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JMenu mnAccountStatement = new JMenu("AccontStatement");
		menuBar.add(mnAccountStatement);
		
		JMenuItem menuAccountStatement = new JMenuItem("Account statement");
		mnAccountStatement.add(menuAccountStatement);
		menuAccountStatement.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/invoice.png")));
		menuAccountStatement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JMenu mnMenuService = new JMenu("MenuService");
		menuBar.add(mnMenuService);
		
		JMenuItem menuService = new JMenuItem("Service");
		mnMenuService.add(menuService);
		menuService.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/international-call.png")));
		menuService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JMenu menuMakeNewTransaction = new JMenu("Make new transaction");
		menuBar.add(menuMakeNewTransaction);
		menuMakeNewTransaction.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/online-banking.png")));
		menuMakeNewTransaction.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JMenuItem menDeposit = new JMenuItem("Deposit");
		menDeposit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Deposit deposit = new Deposit();
				deposit.setVisible(true);
			}
		});
		menDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(menDeposit);
		
		JMenuItem menWithdraw = new JMenuItem("Withdraw");
		menWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(menWithdraw);
		
		JMenuItem menLoan = new JMenuItem("Loan");
		menLoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(menLoan);
		
		JMenuItem manTransfer = new JMenuItem("Transfer");
		manTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(manTransfer);
		
		JLabel titleWelcome = new JLabel("  Welcome to My First Bank!");
		titleWelcome.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/pair-of-bills.png")));
		titleWelcome.setBounds(99, 32, 216, 31);
		titleWelcome.setForeground(Color.BLACK);
		titleWelcome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.add(titleWelcome);
		
		JLabel nameUser = new JLabel("");
		nameUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameUser.setBounds(185, 85, 124, 14);
		home.add(nameUser);
		
		JLabel accountNumberUser = new JLabel(this.getNumberAccount());
		accountNumberUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		accountNumberUser.setBounds(157, 108, 132, 14);
		home.add(accountNumberUser);
		
		JLabel balanceUser = new JLabel(""+controller.showBalance(this.getNumberAccount()));
		balanceUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		balanceUser.setBounds(185, 133, 46, 14);
		home.add(balanceUser);
		
		JLabel NameCamp = new JLabel("");
		NameCamp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NameCamp.setBackground(Color.WHITE);
		NameCamp.setForeground(Color.BLACK);
		NameCamp.setBounds(296, 87, 97, 13);
		home.add(NameCamp);
		
		JLabel NumberAccCamp = new JLabel("");
		NumberAccCamp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NumberAccCamp.setBounds(306, 110, 97, 13);
		home.add(NumberAccCamp);
		
		JLabel BalanceCamp = new JLabel("");
		BalanceCamp.setBounds(316, 135, 45, 13);
		home.add(BalanceCamp);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}





