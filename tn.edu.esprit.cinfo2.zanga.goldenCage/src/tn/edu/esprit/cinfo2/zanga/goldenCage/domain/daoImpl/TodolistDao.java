package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Todolist;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;
/**
 * 
 * @author Aymen
 *
 */
public class TodolistDao implements IDaoGenerique<Todolist> {
	private static TodolistDao instancesof;

	private TodolistDao() {

	}

	public static TodolistDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new TodolistDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Todolist todolist) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO `todolist`(`label`, `User_id`) VALUES ( "
					+ "'" + todolist.getLabel() + "'"
					+ todolist.getCustomer().getId()

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
	public boolean update(Todolist todolist) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `todolist` SET " + "`id`='" + todolist.getId()
					+ "',`label`='" + todolist.getLabel() + "', `User_id` ='"
					+ todolist.getCustomer().getId()

					+ "' WHERE `id`='" + todolist.getId() + "'";

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
	public boolean remove(Todolist todolist) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM `todolist` WHERE `id` = "
					+ todolist.getId();
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
	public List<Todolist> findAll() {
		Connection connection = DataBaseConnection.giveMyconnection();
		List<Todolist> todolists = new ArrayList<Todolist>();
		try {

			Statement statement = connection.createStatement();
			String sql = "select * from `todolist` ";
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();

			CustomerDao customerdao = CustomerDao.getInstanceof();
			while (resultSet.next()) {

				Todolist todolist = new Todolist();
				todolist.setId(resultSet.getInt("id"));
				todolist.setCustomer(customerdao.findById(resultSet
						.getInt("User_id")));
				todolist.setLabel(resultSet.getString("label"));
				todolists.add(todolist);
			}
			return todolists;
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
	public Todolist findById(Integer id) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {

			Statement statement = connection.createStatement();
			String sql = "SELECT `id`, `label`, `User_id` FROM `todolist` WHERE `id`="
					+ id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			CustomerDao customerdao = CustomerDao.getInstanceof();

			Todolist todolist = new Todolist(resultSet.getInt("id"),
					customerdao.findById(resultSet.getInt("User_id")),
					resultSet.getString("label"));

			return todolist;
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
