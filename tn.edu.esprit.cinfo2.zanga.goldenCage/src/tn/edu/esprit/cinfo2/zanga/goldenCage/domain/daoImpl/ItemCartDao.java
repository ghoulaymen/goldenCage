package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.ItemCart;
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
					
					+ "'"+ itemcart.getCart()
					+ "'"+ itemcart.getServise()
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
	public boolean update(ItemCart object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(ItemCart object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ItemCart> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemCart findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
