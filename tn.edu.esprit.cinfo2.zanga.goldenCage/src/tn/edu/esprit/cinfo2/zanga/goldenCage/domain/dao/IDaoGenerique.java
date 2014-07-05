package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao;


import java.util.List;

public interface IDaoGenerique<O> {

	boolean add(O object);

	boolean update(O object);

	boolean remove(O object);

	List<O> findAll();

	O findById(Integer id);
}
