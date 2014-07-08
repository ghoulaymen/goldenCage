package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Category;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

public class CategoryDao implements IDaoGenerique<Category> {
	private static CategoryDao instancesof;

	private CategoryDao() {
		// TODO Auto-generated constructor stub
	}

	public static CategoryDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new CategoryDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Category category) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO `category`( `name`) VALUES ( " + "'"
					+ category.getName()

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
	public boolean update(Category category) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `category` SET " 
						+ "`id`='"+ category.getId()
						+ "',`name`='"+ category.getName() 
						
						+ "' WHERE `id`='"+ category.getId()
					+ "'";

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
	public boolean remove(Category category) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM `category` WHERE `id` = "
					+ category.getId();
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
	public List<Category> findAll() {
		Connection connection = DataBaseConnection.giveMyconnection();
		List<Category> categorys = new ArrayList<Category>();
		try {

			Statement statement = connection.createStatement();
			String sql = "select * from category  ";
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();

			while (resultSet.next()) {

				Category category = new Category(resultSet.getInt("id"),
						resultSet.getString("name"));

				categorys.add(category);
			}
			return categorys;
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
	public Category findById(Integer id) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {

			Statement statement = connection.createStatement();
			String sql = "SELECT `id`, `name` FROM `category` WHERE `id`= "
					+ id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			Category category = new Category(resultSet.getInt("id"),
					resultSet.getString("name"));

			return category;
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
