package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Category;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Service;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

public class ServicesDao implements IDaoGenerique<Service> {
	private static ServicesDao instancesof;

	private ServicesDao() {
		// TODO Auto-generated constructor stub
	}

	public static ServicesDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new ServicesDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Service service) {

		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO `service`(`name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id`) VALUES( "
					+ "'"
					+ service.getName()
					+ "','"
					+ service.getDescription()
					+ "','"
					+ service.getPrice()
					+ "','"
					+ service.getStock()
					+ "','"
					+ service.getImage()
					+ "','"
					+ service.getCategory().getId()
					+ "','"
					+ service.getProvider().getId()

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
	public boolean update(Service service) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `service` SET " + "`id`='" + service.getId()
					+ "',`name`='" + service.getName() + "', `description` ='"
					+ service.getDescription() + "', `price` ='"
					+ service.getPrice() + "', `stock` ='" + service.getStock()
					+ "', `image` ='" + service.getImage()
					+ "', `Category_id` ='" + service.getCategory().getId()
					+ "', `User_id` ='" + service.getProvider().getId()

					+ "' WHERE `id`='" + service.getId() + "'";

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
	public boolean remove(Service service) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM `service` WHERE `id` = "
					+ service.getId();
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
	public List<Service> findAll() {

		Connection connection = DataBaseConnection.giveMyconnection();
		List<Service> services = new ArrayList<Service>();
		try {

			Statement statement = connection.createStatement();
			String sql = "select * from service  ";
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();

			CategoryDao categoryDao = CategoryDao.getInstanceof();
			ProviderDao providerDao = ProviderDao.getInstanceof();

			while (resultSet.next()) {

				Category category = categoryDao.findById(resultSet
						.getInt("Category_id"));

				Provider provider = providerDao.findById(resultSet
						.getInt("User_id"));

				Service service = new Service();

				service.setId(resultSet.getInt("id"));
				service.setName(resultSet.getString("name"));
				service.setDescription(resultSet.getString("description"));
				service.setPrice(resultSet.getDouble("price"));
				service.setStock(resultSet.getInt("stock"));
				service.setProvider(provider);
				service.setCategory(category);

				services.add(service);
			}
			return services;
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
	public Service findById(Integer id) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {

			Statement statement = connection.createStatement();
			String sql = "SELECT `id`, `name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id` FROM `service` WHERE `id` = "
					+ id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			CategoryDao categoryDao = CategoryDao.getInstanceof();
			ProviderDao providerDao = ProviderDao.getInstanceof();

			Category category = categoryDao.findById(resultSet
					.getInt("Category_id"));

			Provider provider = providerDao.findById(resultSet
					.getInt("User_id"));

			Service service = new Service();

			service.setId(resultSet.getInt("id"));
			service.setName(resultSet.getString("name"));
			service.setDescription(resultSet.getString("description"));
			service.setPrice(resultSet.getDouble("price"));
			service.setStock(resultSet.getInt("stock"));
			service.setProvider(provider);
			service.setCategory(category);

			return service;
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

}
