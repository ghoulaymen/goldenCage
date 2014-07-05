package tn.edu.esprit.cinfo2.zanga.goldenCage.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Authentification {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGoldenCage = new JLabel("Golden Cage");
		lblGoldenCage.setForeground(Color.ORANGE);
		lblGoldenCage.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblGoldenCage.setBounds(136, 11, 137, 34);
		frame.getContentPane().add(lblGoldenCage);
		
		textField = new JTextField();
		textField.setBounds(187, 110, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setBounds(99, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("pw");
		lblNewLabel_1.setBounds(99, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(139, 184, 91, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 141, 86, 20);
		frame.getContentPane().add(passwordField);
	}
}
