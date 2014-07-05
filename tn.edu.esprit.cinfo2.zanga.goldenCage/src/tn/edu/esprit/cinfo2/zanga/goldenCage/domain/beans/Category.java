package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;


public class Category implements java.io.Serializable {

	private int id;
	private String name;
	private int idService;

	public Category() {
	}

	public Category(int id, String name, int idService) {
		this.id = id;
		this.name = name;
		this.idService = idService;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdService() {
		return this.idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

}
