package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

/**
 * 
 * @author Aymen
 * 
 */
public class Cart {

	private Integer id;
	private int idUser;

	public Cart() {
	}

	public Cart(Integer id, int idUser) {
		this.id = id;
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", idUser=" + idUser + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + idUser;
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
		Cart other = (Cart) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
