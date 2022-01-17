package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Inicio extends JFrame {

	private JPanel inicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setForeground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		inicio = new JPanel();
		inicio.setBackground(Color.PINK);
		inicio.setForeground(Color.PINK);
		inicio.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(inicio);
		
		JButton buttonLogin1 = new JButton("Login");
		buttonLogin1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonLogin1.setBackground(new Color(255, 0, 255));
		buttonLogin1.setForeground(Color.BLACK);
		buttonLogin1.setBounds(132, 177, 158, 23);
		buttonLogin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		inicio.setLayout(null);
		inicio.add(buttonLogin1);
		
		JLabel logoInicio = new JLabel("");
		logoInicio.setIcon(new ImageIcon(Inicio.class.getResource("/ViewImages/pair-of-bills (2).png")));
		logoInicio.setBounds(178, 44, 99, 64);
		inicio.add(logoInicio);
		
		JLabel titleInicio = new JLabel("My First Bank!");
		titleInicio.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		titleInicio.setBounds(175, 116, 102, 14);
		inicio.add(titleInicio);
	}
}
