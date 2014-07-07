package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class ItemCart {

	private int id;
	private Servise servise;
	private Cart cart;

	public ItemCart() {
		// TODO Auto-generated constructor stub
	}

	public ItemCart(int id, Servise servise, Cart cart) {
		this.id = id;
		this.servise = servise;
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "ItemCart [id=" + id + ", servise=" + servise + ", cart=" + cart
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		result = prime * result + id;
		result = prime * result + ((servise == null) ? 0 : servise.hashCode());
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
		if (servise == null) {
			if (other.servise != null)
				return false;
		} else if (!servise.equals(other.servise))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Servise getServise() {
		return servise;
	}

	public void setServise(Servise servise) {
		this.servise = servise;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
