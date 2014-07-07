package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Customer;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class CustomerDao implements IDaoGenerique<Customer> {

	private static CustomerDao instancesof;

	private CustomerDao() {
		// TODO Auto-generated constructor stub
	}

	public static CustomerDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new CustomerDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Customer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Customer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Customer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
