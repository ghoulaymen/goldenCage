package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Todolist;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class TodolistDao implements IDaoGenerique<Todolist> {
	private static TodolistDao instancesof;

	private TodolistDao() {
		// TODO Auto-generated constructor stub
	}

	public static TodolistDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new TodolistDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Todolist object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Todolist object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Todolist object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Todolist> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todolist findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
