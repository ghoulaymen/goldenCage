package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.gui.Services;

public class ServicesDao implements IDaoGenerique<Services> {
	private static ServicesDao instancesof;

	private ServicesDao() {
		// TODO Auto-generated constructor stub
	}

	public static ServicesDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new ServicesDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Services object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Services object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Services object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Services> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
