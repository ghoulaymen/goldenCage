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
	public boolean update(Itemtodolist object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Itemtodolist object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Itemtodolist> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Itemtodolist findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
