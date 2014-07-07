package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class ProviderDao implements IDaoGenerique<Provider> {

	private static ProviderDao instancesof;

	private ProviderDao() {
		// TODO Auto-generated constructor stub
	}

	public static ProviderDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new ProviderDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Provider object) {

		return false;
	}

	@Override
	public boolean update(Provider object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Provider object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Provider> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provider findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
