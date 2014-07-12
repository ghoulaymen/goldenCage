package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.User;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoAuthentifcation;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class UserDao  implements IDaoGenerique<User>, IDaoAuthentifcation<User> {

	private static UserDao instancesof;

	public static UserDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new UserDao();
		}
		return instancesof;
	}

	private UserDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User Signup(String login, String password) {
		
		return null;
	}


	@Override
	public boolean add(User object) {
		
		return false;
	}

	@Override
	public boolean update(User object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(User object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
