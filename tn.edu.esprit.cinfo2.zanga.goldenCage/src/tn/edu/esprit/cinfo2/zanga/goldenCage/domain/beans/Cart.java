package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class Cart implements java.io.Serializable {

	private Integer id;
	private int idUser;

	public Cart() {
	}

	public Cart(int idUser) {
		this.idUser = idUser;
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

}
