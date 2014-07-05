package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Authentification {

	private JFrame frmAuthentification;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
					window.frmAuthentification.setVisible(true);
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
		frmAuthentification = new JFrame();
		frmAuthentification.setTitle("Authentification");
		frmAuthentification.getContentPane().setBackground(Color.WHITE);
		frmAuthentification.setBounds(100, 100, 450, 300);
		frmAuthentification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblGoldenCage = new JLabel("Golden Cage");
		lblGoldenCage.setBounds(99, 40, 169, 31);
		lblGoldenCage.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));

		textField = new JTextField();
		textField.setBounds(211, 105, 86, 20);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(211, 161, 86, 20);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(87, 98, 60, 31);

		JLabel lblPassWord = new JLabel("Password");
		lblPassWord.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassWord.setBounds(87, 163, 86, 17);
		frmAuthentification.getContentPane().setLayout(null);
		frmAuthentification.getContentPane().add(lblGoldenCage);
		frmAuthentification.getContentPane().add(textField);
		frmAuthentification.getContentPane().add(textField_1);
		frmAuthentification.getContentPane().add(lblNewLabel);
		frmAuthentification.getContentPane().add(lblPassWord);

		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Services services = new Services();
				services.getFrame().setVisible(true);
				frmAuthentification.setVisible(false);
			}
		});
		btnValidate.setBounds(211, 209, 89, 23);
		frmAuthentification.getContentPane().add(btnValidate);
	}

	public JFrame getFrmAuthentification() {
		return frmAuthentification;
	}

	public void setFrmAuthentification(JFrame frmAuthentification) {
		this.frmAuthentification = frmAuthentification;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

}
