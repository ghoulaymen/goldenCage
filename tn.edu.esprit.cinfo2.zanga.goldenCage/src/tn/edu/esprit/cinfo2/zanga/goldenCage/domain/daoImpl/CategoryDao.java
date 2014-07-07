package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;
import java.util.Locale.Category;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class CategoryDao implements IDaoGenerique<Category>{
private static CategoryDao instancesof;

private CategoryDao() {
	// TODO Auto-generated constructor stub
}
public static CategoryDao getInstanceof() {

	if (instancesof == null) {
		instancesof = new CategoryDao();
	}
		return instancesof;
}

	@Override
	public boolean add(Category object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Category object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Category object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
