package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.ItemCart;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
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
	public boolean add(ItemCart object) {
		// TODO Auto-generated method stub
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
