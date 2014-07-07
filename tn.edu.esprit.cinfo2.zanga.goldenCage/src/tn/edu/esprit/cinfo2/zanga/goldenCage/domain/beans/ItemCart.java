package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class ItemCart {

	private int id;
	private int idServices;
	private int idCart;

	public ItemCart() {
		// TODO Auto-generated constructor stub
	}

	public ItemCart(int id, int idServices, int idCart) {
		this.id = id;
		this.idServices = idServices;
		this.idCart = idCart;
	}

	@Override
	public String toString() {
		return "ItemCart [id=" + id + ", idServices=" + idServices
				+ ", idCart=" + idCart + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + idCart;
		result = prime * result + idServices;
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
		ItemCart other = (ItemCart) obj;
		if (id != other.id)
			return false;
		if (idCart != other.idCart)
			return false;
		if (idServices != other.idServices)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdServices() {
		return idServices;
	}

	public void setIdServices(int idServices) {
		this.idServices = idServices;
	}

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

}
