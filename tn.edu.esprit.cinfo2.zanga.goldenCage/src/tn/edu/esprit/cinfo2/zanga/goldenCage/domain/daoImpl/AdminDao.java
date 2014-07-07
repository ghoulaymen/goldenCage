package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Admin;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class AdminDao implements IDaoGenerique<Admin> {

	private static AdminDao instancesof;

	private AdminDao() {
		// TODO Auto-generated constructor stub
	}

	public static AdminDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new AdminDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Admin object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Admin object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Admin object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
