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
	private String job;

	public Provider() {
		// TODO Auto-generated constructor stub
	}



	


	public Provider(Integer id, String firstname, String lastname,
			String password, String email, String image) {
		super(id, firstname, lastname, password, email, image);
		// TODO Auto-generated constructor stub
	}






	public Provider(Integer id, String firstname, String lastname,
			String password, String email) {
		super(id, firstname, lastname, password, email);
		// TODO Auto-generated constructor stub
	}






	public Provider(String reason_social, String adresse, String tel, String job) {
		this.reason_social = reason_social;
		this.adresse = adresse;
		this.tel = tel;
		this.job = job;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
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
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
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
		return "Provider [reason_social=" + reason_social + ", adresse="
				+ adresse + ", tel=" + tel + ", job=" + job + "]";
	}






	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
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
