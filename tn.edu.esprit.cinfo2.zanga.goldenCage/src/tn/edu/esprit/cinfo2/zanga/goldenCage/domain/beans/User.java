package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String firstname;
	private String lastname;
	private String typeof;
	private String passwd;

	public User() {
	}

	public User(String firstname, String lastname, String typeof, String passwd) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.typeof = typeof;
		this.passwd = passwd;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTypeof() {
		return this.typeof;
	}

	public void setTypeof(String typeof) {
		this.typeof = typeof;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
