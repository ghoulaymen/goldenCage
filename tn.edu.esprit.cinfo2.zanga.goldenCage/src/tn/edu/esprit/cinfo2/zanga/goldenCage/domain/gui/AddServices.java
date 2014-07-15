package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Service;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl.ServicesDao;

public class AddServices {

	private JFrame frmAddService;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		frmAddService.setBounds(100, 100, 424, 393);
		frmAddService.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddService.getContentPane().setLayout(null);

		JLabel lblServiceName = new JLabel("Name");
		lblServiceName.setBounds(47, 42, 93, 24);
		frmAddService.getContentPane().add(lblServiceName);

		textField = new JTextField();
		textField.setBounds(129, 43, 230, 22);
		frmAddService.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(47, 77, 93, 24);
		frmAddService.getContentPane().add(lblDescription);

		textField_1 = new JTextField();
		textField_1.setBounds(129, 77, 230, 67);
		frmAddService.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Services services = new Services();
				services.getFrame().setVisible(true);
				frmAddService.setVisible(false);
			}
		});
		btnValidate.setBounds(129, 301, 89, 23);
		frmAddService.getContentPane().add(btnValidate);

		textField_2 = new JTextField();
		textField_2.setBounds(129, 155, 86, 20);
		frmAddService.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(47, 158, 46, 14);
		frmAddService.getContentPane().add(lblPrice);

		textField_3 = new JTextField();
		textField_3.setBounds(129, 186, 86, 20);
		frmAddService.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(129, 223, 230, 20);
		frmAddService.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel = new JLabel("Stock");
		lblNewLabel.setBounds(47, 189, 46, 14);
		frmAddService.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setBounds(47, 258, 46, 14);
		frmAddService.getContentPane().add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(129, 254, 136, 20);
		frmAddService.getContentPane().add(comboBox);
		comboBox.addItem("Choose a category");
		comboBox.addItem(" Category 1 ");
		comboBox.addItem(" Category 2 ");
		comboBox.addItem(" Category 3 ");

		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Adding a service
				Service service = new Service(0, textField.getText(),
						textField_1.getText(), Double.parseDouble(textField_2
								.getText()), Integer.parseInt(textField_3
								.getText()), null, null, null);
				@SuppressWarnings("static-access")
				ServicesDao servDao = ServicesDao.getInstanceof();
				if (servDao.add(service)) {
					Services services = new Services();
					services.getFrame().setVisible(true);
				}
				Services services = new Services();
				services.getFrame().setVisible(true);
				frmAddService.setVisible(false);
			}
		});
		btnNewButton.setBounds(270, 301, 89, 23);
		frmAddService.getContentPane().add(btnNewButton);
	}
}
