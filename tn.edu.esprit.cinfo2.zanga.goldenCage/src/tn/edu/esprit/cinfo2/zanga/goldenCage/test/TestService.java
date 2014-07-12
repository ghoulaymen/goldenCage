package tn.edu.esprit.cinfo2.zanga.goldenCage.test;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Category;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Service;
/**
 * 
 * @author Aymen
 *
 */
public class TestService {

	public static void main(String[] args) {

		Provider troupe = new Provider();

		troupe.setFirstname("Bou dinar");
		troupe.setPassword("123456");
		troupe.setLastname("Troupe");
		troupe.setEmail("troupeboudinar@esprit.tn");
		troupe.setAdresse("Tunis");
		troupe.setReason_social("1542-88715");
		troupe.setTel("23726584");
		troupe.setImage("image");
		Category category = new Category(1, "Troupe");

		Service service = new Service(1, "Troupe afra7",
				"Troupe vous offre ses services", null, 0, "", troupe, category);
		System.out.println(category);
		System.out.println(service);

	}
}
