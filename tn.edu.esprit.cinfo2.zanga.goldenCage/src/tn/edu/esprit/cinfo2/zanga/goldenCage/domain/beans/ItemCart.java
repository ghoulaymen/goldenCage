package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class ItemCart {

	private int id;
	private Service service;
	private Cart cart;

	public ItemCart() {
		// TODO Auto-generated constructor stub
	}

	public ItemCart(int id, Service servise, Cart cart) {
		this.id = id;
		this.service = servise;
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "ItemCart [id=" + id + ", servise=" + service + ", cart=" + cart
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		result = prime * result + id;
		result = prime * result + ((service == null) ? 0 : service.hashCode());
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
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		if (id != other.id)
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Service getServise() {
		return service;
	}

	public void setServise(Service servise) {
		this.service = servise;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
