package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class Servise implements java.io.Serializable {

	private int id;
	private String name;
	private int idProvider;

	public Servise() {
	}

	public Servise(int id, String name, int idProvider) {
		this.id = id;
		this.name = name;
		this.idProvider = idProvider;
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

	public int getIdProvider() {
		return this.idProvider;
	}

	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}

}
