package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

/**
 * 
 * @author Aymen
 * 
 */
public class Provider extends User {

	private String reason_social;
	private String adresse;
	private String tel;

	public Provider() {
		// TODO Auto-generated constructor stub
	}

	public Provider(Integer id, String firstname, String lastname,
			String password, String email, String image, String role,
			String reason_social, String adresse, String tel) {
		super(id, firstname, lastname, password, email, image, role);
		this.reason_social = reason_social;
		this.adresse = adresse;
		this.tel = tel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((reason_social == null) ? 0 : reason_social.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
		Provider other = (Provider) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (reason_social == null) {
			if (other.reason_social != null)
				return false;
		} else if (!reason_social.equals(other.reason_social))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provider [" + super.toString() + "reason_social=" + reason_social + ", adresse="
				+ adresse + ", tel=" + tel + "]";
	}

	public String getReason_social() {
		return reason_social;
	}

	public void setReason_social(String reason_social) {
		this.reason_social = reason_social;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
