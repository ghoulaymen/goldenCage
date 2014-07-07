package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl;

import java.util.List;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Comment;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.dao.IDaoGenerique;

public class CommentDao implements IDaoGenerique<Comment> {

	private static CommentDao instancesof;

	private CommentDao() {
		// TODO Auto-generated constructor stub
	}

	public static CommentDao getInstanceof() {

		if (instancesof == null) {
			instancesof = new CommentDao();
		}
		return instancesof;
	}

	@Override
	public boolean add(Comment object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Comment object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Comment object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
