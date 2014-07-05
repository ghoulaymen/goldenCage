package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class Itemtodolist implements java.io.Serializable {

	private Integer id;
	private int idTodolist;
	private String state;
	private int idCategory;

	public Itemtodolist() {
	}

	public Itemtodolist(int idTodolist, String state, int idCategory) {
		this.idTodolist = idTodolist;
		this.state = state;
		this.idCategory = idCategory;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdTodolist() {
		return this.idTodolist;
	}

	public void setIdTodolist(int idTodolist) {
		this.idTodolist = idTodolist;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

}
