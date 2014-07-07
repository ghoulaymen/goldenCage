package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

/**
 * 
 * @author Aymen
 *
 */
public class Todolist {

	private Integer id;
	private int idCostumer;
	private String label;

	public Todolist() {
		// TODO Auto-generated constructor stub
	}

	public Todolist(Integer id, int idCostumer, String label) {
		this.id = id;
		this.idCostumer = idCostumer;
		this.label = label;
	}

	@Override
	public String toString() {
		return "Todolist [label=" + label + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + idCostumer;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
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
		Todolist other = (Todolist) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idCostumer != other.idCostumer)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdCostumer() {
		return idCostumer;
	}

	public void setIdCostumer(int idCostumer) {
		this.idCostumer = idCostumer;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
