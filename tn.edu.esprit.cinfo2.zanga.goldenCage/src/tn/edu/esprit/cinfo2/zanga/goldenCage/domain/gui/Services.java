package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Services {

	private JFrame frmServices;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Services window = new Services();
					window.frmServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Services() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmServices = new JFrame();
		frmServices.setTitle("Services");
		frmServices.setBounds(100, 100, 450, 300);
		frmServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmServices.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frmServices.getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("ADD Services");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Retour");
		panel.add(btnNewButton_1);

		JPanel panel_1 = new JPanel();
		frmServices.getContentPane().add(panel_1, BorderLayout.NORTH);

		JPanel panel_2 = new JPanel();
		frmServices.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "Service",
				"Read", "Update", "Delete" }));
		panel_2.add(table.getTableHeader(), BorderLayout.NORTH);
		panel_2.add(table, BorderLayout.CENTER);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Authentification authentification = new Authentification();
				authentification.getFrmAuthentification().setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddServices addServices = new AddServices();

				addServices.getFrmAddService().setVisible(true);
			}
		});
	}

	public JFrame getFrame() {
		return frmServices;
	}

	public void setFrame(JFrame frame) {
		this.frmServices = frame;
	}
}
