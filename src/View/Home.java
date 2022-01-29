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
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel home;
	private JLabel accountNumberUser;
	private JLabel balanceUser;
	private static String numberAccount;
	private static Double balance;
	
	
	public static Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public static String getNumberAccount() {
		return numberAccount;
	}
	public void setNumberAccount(String numberAccount) {		
		this.numberAccount = numberAccount;

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
		
		HomeController controller = new HomeController(this);
		LoginController controller2 = new LoginController();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 300);
		home = new JPanel();
		home.setBackground(Color.PINK);
		home.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(home);
		home.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 429, 31);
		home.add(menuBar);
		
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
		menWithdraw.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Withdraw withdraw = new Withdraw();
				withdraw.setVisible(true);
			}
		});
		menWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(menWithdraw);
		
		JMenuItem menLoan = new JMenuItem("Loan");
		menLoan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Loan loan = new Loan();
				loan.setVisible(true);
				
			}
		});
		menLoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(menLoan);
		
		JMenuItem manTransfer = new JMenuItem("Transfer");
		manTransfer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Transfer transfer = new Transfer();
				transfer.setVisible(true);
			}
		});
		manTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuMakeNewTransaction.add(manTransfer);
		
		JMenuItem menuService = new JMenuItem("Service");
		menuBar.add(menuService);
		menuService.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Service service = new Service();
				service.setVisible(true);
			}
		});
		menuService.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/international-call.png")));
		menuService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				Inicio inicio = new  Inicio();
				inicio.setVisible(true);
			}
		});
		menuBar.add(menuExit);
		menuExit.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/exit.png")));
		menuExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel titleWelcome = new JLabel("  Welcome to My First Bank!");
		titleWelcome.setIcon(new ImageIcon(Home.class.getResource("/ViewImages/pair-of-bills.png")));
		titleWelcome.setBounds(96, 61, 216, 31);
		titleWelcome.setForeground(Color.BLACK);
		titleWelcome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.add(titleWelcome);
		
		
		JLabel accountNumberUser = new JLabel("Account Number");
		accountNumberUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		accountNumberUser.setBounds(96, 126, 132, 14);
		home.add(accountNumberUser);
		
		JLabel balanceUser = new JLabel("Balance");
		balanceUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		balanceUser.setBounds(122, 151, 46, 14);
		home.add(balanceUser);
		
		
		JLabel NumberAccCamp = new JLabel(this.getNumberAccount());
		NumberAccCamp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NumberAccCamp.setBounds(245, 127, 97, 13);
		home.add(NumberAccCamp);
		
		JLabel BalanceCamp = new JLabel(""+controller.showBalance(this.getNumberAccount()));
		BalanceCamp.setBounds(267, 153, 45, 13);
		home.add(BalanceCamp);
		this.setBalance(controller.showBalance(this.getNumberAccount()));
		
		
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





