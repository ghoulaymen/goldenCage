package tn.edu.esprit.cinfo2.zanga.goldenCage.test;

import java.sql.Date;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Customer;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;

public class TestUser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Customer aymen = new Customer();

		aymen.setId(1);
		aymen.setLastname("Ghoul");
		aymen.setFirstname("Aymen");
		aymen.setEmail("aymen@tanitweb.com");
		Date date = new Date(0, 0, 0);
		aymen.setDate_wedding(date);

		System.out.println(aymen);
		Provider Troupe = new Provider();
		System.out.println(Troupe);

	}

}
