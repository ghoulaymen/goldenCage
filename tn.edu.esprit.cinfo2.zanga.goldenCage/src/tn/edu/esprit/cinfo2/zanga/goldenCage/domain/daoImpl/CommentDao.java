package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Comment;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

public class CommentDao implements IDaoGenerique<Comment> {

	private static CommentDao instancesof;

	private CommentDao() {
		// TODO Auto-generated constructor stub
	}

	public static CommentDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new CommentDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Comment comment) {

		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO `comment`(`id`, `User_id`, `comment`, `published_at`, `Service_id`) VALUES ( "
					+ "'"
					+ comment.getId()
					+ "'"
					+ comment.getUser().getId()
					+ "'"
					+ comment.getComment()
					+ "'"
					+ comment.getPublished_at() + "'" + comment.getService()

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
	public boolean update(Comment comment) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `comment` SET `id`='" + comment.getId()
					+ "',`User_id`='" + comment.getUser().getId()
					+ "', `comment` ='" + comment.getComment()
					+ "', `published_at` ='" + comment + "', `Service_id` ='"
					+ comment

					+ "' WHERE `id`='" + comment.getId() + "'";

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
	public boolean remove(Comment comment) {
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM `comment` WHERE `id` = "
					+ comment.getId();
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
	public List<Comment> findAll() {
		Connection connection = DataBaseConnection.giveMyconnection();
		List<Comment> comments = new ArrayList<Comment>();
		try {

			Statement statement = connection.createStatement();

			String sql = "select * from `comment` ";

			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();

			UserDao userDao = UserDao.getInstanceof();
			ServicesDao servicesDao = ServicesDao.getInstanceof();

			while (resultSet.next()) {

				Comment comment = new Comment();

				comment.setId(resultSet.getInt("id"));
				comment.setUser(userDao.findById(resultSet.getInt("User_id")));
				comment.setComment(resultSet.getString("comment"));
				comment.setPublished_at(resultSet.getDate("published_at"));
				comment.setService(servicesDao.findById(resultSet
						.getInt("Service_id")));

				comments.add(comment);
			}
			return comments;
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
	public Comment findById(Integer id) {
		// TODO Auto-generated method stub

		Connection connection = DataBaseConnection.giveMyconnection();
		try {

			Statement statement = connection.createStatement();
			String sql = " `id`, `User_id`, `comment`, `published_at`, `Service_id` FROM `comment` where `id` = "
					+ id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			UserDao userDao = UserDao.getInstanceof();
			ServicesDao servicesDao = ServicesDao.getInstanceof();

			Comment comment = new Comment();

			comment.setId(resultSet.getInt("id"));
			comment.setUser(userDao.findById(resultSet.getInt("User_id")));
			comment.setComment(resultSet.getString("comment"));
			comment.setPublished_at(resultSet.getDate("published_at"));
			comment.setService(servicesDao.findById(resultSet
					.getInt("Service_id")));

			return comment;
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
