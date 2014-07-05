package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.User;

public interface UserDao {

	public void insert(User bean) throws Exception;
	public void update(User bean) throws Exception;
	public void delete(User bean) throws Exception;
	public User findByPrimaryKey(int idProduit) throws Exception ;
	public User[] findAll() throws Exception;
}
