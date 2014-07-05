package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class Todolist implements java.io.Serializable {

	private Integer id;
	private int idCostumer;

	public Todolist() {
	}

	public Todolist(int idCostumer) {
		this.idCostumer = idCostumer;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdCostumer() {
		return this.idCostumer;
	}

	public void setIdCostumer(int idCostumer) {
		this.idCostumer = idCostumer;
	}

}
