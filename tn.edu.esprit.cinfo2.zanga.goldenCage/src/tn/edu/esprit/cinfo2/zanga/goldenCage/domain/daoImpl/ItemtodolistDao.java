package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Itemtodolist;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

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
	public boolean add(Itemtodolist object) {
		// TODO Auto-generated method stub
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
