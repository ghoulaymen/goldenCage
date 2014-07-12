package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Cart;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.ItemCart;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Service;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.utilities.DataBaseConnection;

/**
 * 
 * @author Aymen
 * 
 */
public class ItemCartDao implements IDaoGenerique<ItemCart> {

	private static ItemCartDao instancesof;

	private ItemCartDao() {
		// TODO Auto-generated constructor stub
	}

	public static ItemCartDao getInstanceof() {
		if (instancesof == null)
			instancesof = new ItemCartDao();

		return instancesof;
	}

	@Override
	public boolean add(ItemCart itemcart) {

		Connection connection = DataBaseConnection.giveMyconnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO `itemcart`( `Cart_id`, `Service_id`) VALUES  ( "

					+ "'"
					+ itemcart.getCart()
					+ "'"
					+ itemcart.getServise()
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
	public boolean update(ItemCart itemcart) {
		// TODO Auto-generated method stub
		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE `itemcart` SET' `id` " + itemcart.getId()

			+ "',`Cart_id`='" + itemcart.getCart() + "',`Service_id`='"
					+ itemcart.getServise().getId()

					+ "' WHERE `id`='" + itemcart.getId() + "'";

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
	public boolean remove(ItemCart itemcart) {

		Connection connection = DataBaseConnection.giveMyconnection();

		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM `itemcart` WHERE `id` = "
					+ itemcart.getId();
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
	public List<ItemCart> findAll() {

		return null;
	}

	@Override
	public ItemCart findById(Integer id) {
		Connection connection = DataBaseConnection.giveMyconnection();
		try {

			Statement statement = connection.createStatement();
			String sql = " SELECT `id`, `Cart_id`, `Service_id` FROM `itemcart` where `id` = "
					+ id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.first();
			CartDao cartDao = CartDao.getInstanceof();
			ServicesDao serviceDao = ServicesDao.getInstanceof();
			Cart cart = cartDao.findById(resultSet.getInt("Cart_id"));
			Service service = serviceDao.findById(resultSet
					.getInt("Service_id"));

			ItemCart itemcart = new ItemCart();
			itemcart.setId(resultSet.getInt("id"));
			itemcart.setCart(cart);
			itemcart.setServise(service);

			return itemcart;
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
