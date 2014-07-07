package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

public class ProviderDao implements IDaoGenerique<Provider> {

	private static ProviderDao instancesof;

	private ProviderDao() {
		// TODO Auto-generated constructor stub
	}

	public static ProviderDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new ProviderDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Provider provider) {

		Connection connection = DataBaseConnection.giveMyconnection();
		provider.setRole("provider");
		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO user( lastname, firstname, email, password,reasonSocial, adresse, tel, image, role) VALUES("
					+ "'"
					+ provider.getLastname()
					+ "','"
					+ provider.getFirstname()
					+ "','"
					+ provider.getEmail()
					+ "','"
					+ provider.getPassword()
					+ "','"
					+ provider.getReason_social()
					+ "','"
					+ provider.getAdresse()
					+ "','"
					+ provider.getTel()
					+ "','"
					+ provider.getImage()
					+ "','"
					+ provider.getRole()

					+ "')";
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
	public boolean update(Provider object) {

		return false;
	}

	@Override
	public boolean remove(Provider object) {

		return false;
	}

	@Override
	public List<Provider> findAll() {

		return null;
	}

	@Override
	public Provider findById(Integer id) {

		return null;
	}

}
