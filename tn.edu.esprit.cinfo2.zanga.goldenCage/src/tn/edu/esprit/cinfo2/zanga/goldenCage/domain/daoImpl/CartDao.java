package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Cart;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class CartDao implements IDaoGenerique<Cart> {

	private static CartDao instancesof;

	private CartDao() {
		// TODO Auto-generated constructor stub
	}

public static CartDao getInstanceof() {

	if (instancesof == null) {
		instancesof = new CartDao();
	}
		return instancesof;
}
	@Override
	public boolean add(Cart object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cart object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Cart object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}