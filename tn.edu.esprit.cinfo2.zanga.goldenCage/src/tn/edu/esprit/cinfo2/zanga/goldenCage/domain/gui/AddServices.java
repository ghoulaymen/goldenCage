package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.gui;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddServices {

	private JFrame frmAddService;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddServices window = new AddServices();
					window.frmAddService.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddServices() {
		initialize();
	}

	public JFrame getFrmAddService() {
		return frmAddService;
	}

	public void setFrmAddService(JFrame frmAddService) {
		this.frmAddService = frmAddService;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddService = new JFrame();
		frmAddService.setTitle("Add Service");
		frmAddService.setBounds(100, 100, 450, 300);
		frmAddService.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddService.getContentPane().setLayout(null);

		JLabel lblServiceName = new JLabel("Service Name");
		lblServiceName.setBounds(47, 45, 93, 24);
		frmAddService.getContentPane().add(lblServiceName);

		textField = new JTextField();
		textField.setBounds(129, 47, 230, 22);
		frmAddService.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(47, 124, 93, 24);
		frmAddService.getContentPane().add(lblDescription);

		textField_1 = new JTextField();
		textField_1.setBounds(129, 103, 230, 67);
		frmAddService.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Services services = new Services();
				services.getFrame().setVisible(true);
			}
		});
		btnValidate.setBounds(309, 211, 89, 23);
		frmAddService.getContentPane().add(btnValidate);
	}
}
