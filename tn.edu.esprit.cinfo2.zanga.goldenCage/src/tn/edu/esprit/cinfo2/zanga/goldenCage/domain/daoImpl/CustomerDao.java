package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Customer;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

public class CustomerDao implements IDaoGenerique<Customer> {

	private static CustomerDao instancesof;

	private CustomerDao() {
		// TODO Auto-generated constructor stub
	}

	public static CustomerDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new CustomerDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Customer customer) {
		customer.setRole("Customer");
		;

		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO user( lastname, firstname, email, password, dateWedding, image, role) VALUES("
					+ "'"
					+ customer.getLastname()
					+ "','"
					+ customer.getFirstname()
					+ "','"
					+ customer.getEmail()
					+ "','"
					+ customer.getPassword()

					+ "','"
					+ customer.getDate_wedding()
					+ "','"
					+ customer.getImage() + "','" + customer.getRole() + "')";

			statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean update(Customer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Customer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
