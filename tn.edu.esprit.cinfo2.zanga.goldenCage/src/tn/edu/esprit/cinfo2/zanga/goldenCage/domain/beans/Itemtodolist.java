package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

/**
 * 
 * @author Aymen
 * 
 */
public class Itemtodolist {

	private Integer id;
	private Todolist todolist;
	private String state;
	private Category category;

	public Itemtodolist() {
	}

	public Itemtodolist(Integer id, Todolist todolist, String state,
			Category category) {
		this.id = id;
		this.todolist = todolist;
		this.state = state;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Itemtodolist [id=" + id + ", todolist=" + todolist + ", state="
				+ state + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result
				+ ((todolist == null) ? 0 : todolist.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Itemtodolist other = (Itemtodolist) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (todolist == null) {
			if (other.todolist != null)
				return false;
		} else if (!todolist.equals(other.todolist))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Todolist getTodolist() {
		return todolist;
	}

	public void setTodolist(Todolist todolist) {
		this.todolist = todolist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
