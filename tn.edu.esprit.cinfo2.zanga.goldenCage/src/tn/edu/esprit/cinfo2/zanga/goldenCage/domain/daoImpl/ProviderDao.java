package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoAuthentifcation;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

public class ProviderDao implements IDaoGenerique<Provider>,
		IDaoAuthentifcation<Provider> {

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
					+ provider.getImage() + "','" + provider.getRole()

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
	public boolean update(Provider provider) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `user` SET " + "`lastname`='"
					+ provider.getLastname() + "',`firstname`='"
					+ provider.getFirstname() + "',`email`='"
					+ provider.getEmail() + "',`password`='"
					+ provider.getPassword() + "',`role`='"
					+ provider.getRole() + "',`reasonSocial`='"
					+ provider.getReason_social() + "',`adresse`='"
					+ provider.getAdresse() + "',`tel`='" + provider.getTel()
					+ "',`image`='" + provider.getImage() + "' WHERE id='"
					+ provider.getId() + "'";

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
	public boolean remove(Provider provider) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "delete from user where id = " + provider.getId();
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
	public List<Provider> findAll() {
		Connection connection = DataBaseConnection.giveMyconnection();
		List<Provider> providers = new ArrayList<Provider>();
		try {

			Statement statement = connection.createStatement();
			String sql = "select * from user where role = 'provider' ";
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			while (resultSet.next()) {
				Provider provider = new Provider(resultSet.getInt("id"),
						resultSet.getString("firstname"),
						resultSet.getString("lastname"),
						resultSet.getString("password"),
						resultSet.getString("email"),
						resultSet.getString("image"),
						resultSet.getString("role"),
						resultSet.getString("reasonSocial"),
						resultSet.getString("adresse"),
						resultSet.getString("tel"));
				providers.add(provider);
			}
			return providers;
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
		return null;
	}

	@Override
	public Provider findById(Integer id) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {

			Statement statement = connection.createStatement();
			String sql = "select * from user where id=" + id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			Provider provider = new Provider(resultSet.getInt("id"),
					resultSet.getString("firstname"),
					resultSet.getString("lastname"),
					resultSet.getString("password"),
					resultSet.getString("email"), resultSet.getString("image"),
					resultSet.getString("role"),
					resultSet.getString("reasonSocial"),
					resultSet.getString("adresse"), resultSet.getString("tel"));

			return provider;
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
		return null;
	}

	@Override
	public Provider Signup(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provider Signin(Provider object) {
		// TODO Auto-generated method stub
		return null;
	}
}
