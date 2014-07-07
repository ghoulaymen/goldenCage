package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

import java.sql.Date;

/**
 * 
 * @author Aymen
 * 
 */
public class Customer extends User {

	/**
	 * 
	 */
	private Date dateWedding;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String firstname, String lastname,
			String password, String email, String image, String role) {
		super(id, firstname, lastname, password, email, image, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " Customer [ " + super.toString() + "date_wedding="
				+ dateWedding + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateWedding == null) ? 0 : dateWedding.hashCode());
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
		Customer other = (Customer) obj;
		if (dateWedding == null) {
			if (other.dateWedding != null)
				return false;
		} else if (!dateWedding.equals(other.dateWedding))
			return false;
		return true;
	}

	public Date getDate_wedding() {
		return dateWedding;
	}

	public void setDate_wedding(Date date_wedding) {
		this.dateWedding = date_wedding;
	}

}
