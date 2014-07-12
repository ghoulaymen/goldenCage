package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Itemtodolist;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

/**
 * 
 * @author Aymen
 * 
 */
public class ItemtodolistDao implements IDaoGenerique<Itemtodolist> {
	private static ItemtodolistDao instancesof;

	private ItemtodolistDao() {
		// TODO Auto-generated constructor stub
	}

	public static ItemtodolistDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new ItemtodolistDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Itemtodolist itemtodolist) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO `itemtodolist`(`state`, `Category_id`, `ToDoList_id`) VALUES ( "
					+ "'"
					+ itemtodolist.getState()
					+ "'"
					+ itemtodolist.getCategory().getId()
					+ "'"
					+ itemtodolist.getState()

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
	public boolean update(Itemtodolist itemtodolist) {
		Connection connection = DataBaseConnection.giveMyconnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `itemtodolist` SET `id`='"
					+ itemtodolist.getId() + "',`state`='"
					+ itemtodolist.getState() + "', `Category_id` ='"
					+ itemtodolist.getCategory().getId()
					+ "', `ToDoList_id` ='"
					+ itemtodolist.getTodolist().getId()

					+ "' WHERE `id`='" + itemtodolist.getId() + "'";

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
	public boolean remove(Itemtodolist itemtodolist) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM `itemtodolist` WHERE `id` = "
					+ itemtodolist.getId();
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
	public List<Itemtodolist> findAll() {
		Connection connection = DataBaseConnection.giveMyconnection();
		List<Itemtodolist> itemtodolists = new ArrayList<Itemtodolist>();
		try {

			Statement statement = connection.createStatement();

			String sql = "select * from `itemtodolist` ";

			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();

			CategoryDao categorDao = CategoryDao.getInstanceof();
			TodolistDao toDoListDao = TodolistDao.getInstanceof();

			while (resultSet.next()) {

				Itemtodolist itemtodolist = new Itemtodolist();

				itemtodolist.setId(resultSet.getInt("id"));
				itemtodolist.setState(resultSet.getString("state"));
				itemtodolist.setCategory(categorDao.findById(resultSet
						.getInt("Category_id")));
				itemtodolist.setTodolist(toDoListDao.findById(resultSet
						.getInt("ToDoList_id")));

				itemtodolists.add(itemtodolist);
			}
			return itemtodolists;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public Itemtodolist findById(Integer id) {
		Connection connection = DataBaseConnection.giveMyconnection();
		try {

			Statement statement = connection.createStatement();
			String sql = "SELECT `id`, `state`, `Category_id`, `ToDoList_id` FROM `itemtodolist` where `id`="
					+ id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			CategoryDao categorDao = CategoryDao.getInstanceof();
			TodolistDao toDoListDao = TodolistDao.getInstanceof();

			Itemtodolist itemtodolist = new Itemtodolist();

			itemtodolist.setId(resultSet.getInt("id"));
			itemtodolist.setState(resultSet.getString("state"));
			itemtodolist.setCategory(categorDao.findById(resultSet
					.getInt("Category_id")));
			itemtodolist.setTodolist(toDoListDao.findById(resultSet
					.getInt("ToDoList_id")));

			return itemtodolist;
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
