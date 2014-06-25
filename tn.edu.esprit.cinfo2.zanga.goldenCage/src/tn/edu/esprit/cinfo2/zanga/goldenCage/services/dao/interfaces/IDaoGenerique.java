package tn.edu.esprit.cinfo2.zanga.goldenCage.services.dao.interfaces;

import java.util.List;

public interface IDaoGenerique<I> {
	
	
	boolean add(I object);

	boolean update(I object);

	boolean remove(I object);

	List<I> findAll();

	I findById(Integer id);
}
