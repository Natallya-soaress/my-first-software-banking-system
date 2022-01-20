package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JMenuItem;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTree;

public class Home extends JFrame {

	private JPanel home;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
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
		
		JLabel nameUser = new JLabel("Name");
		nameUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameUser.setBounds(185, 85, 124, 14);
		home.add(nameUser);
		
		JLabel accountNumberUser = new JLabel("Account number");
		accountNumberUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		accountNumberUser.setBounds(157, 108, 132, 14);
		home.add(accountNumberUser);
		
		JLabel balanceUser = new JLabel("Balance");
		balanceUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		balanceUser.setBounds(185, 133, 46, 14);
		home.add(balanceUser);
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
