package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

import java.util.Date;

public class Comment implements java.io.Serializable {

	private Integer id;
	private int idUser;
	private Date date;

	public Comment() {
	}

	public Comment(int idUser, Date date) {
		this.idUser = idUser;
		this.date = date;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
