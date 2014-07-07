package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

/**
 * 
 * @author Aymen
 * 
 */
public class Admin extends User {

	private String role;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	
	public Admin(String role) {
		this.role = role;
	}
	

	public Admin(Integer id, String firstname, String lastname,
			String password, String email, String image) {
		super(id, firstname, lastname, password, email, image);
		// TODO Auto-generated constructor stub
	}


	public Admin(Integer id, String firstname, String lastname,
			String password, String email) {
		super(id, firstname, lastname, password, email);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Admin [role=" + role + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
