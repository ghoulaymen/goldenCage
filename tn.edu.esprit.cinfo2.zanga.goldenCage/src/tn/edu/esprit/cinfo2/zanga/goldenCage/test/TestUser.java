package tn.edu.esprit.cinfo2.zanga.goldenCage.test;

import java.sql.Date;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Customer;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl.CustomerDao;

public class TestUser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Customer aymen = new Customer();

		aymen.setLastname("Ghoul");
		aymen.setFirstname("Aymen");
		aymen.setEmail("aymen2@tanitweb.com");
		aymen.setPassword("123456");
		Date date = new Date(0, 0, 0);
		aymen.setDate_wedding(date);

		System.out.println(aymen);

		CustomerDao customerDao = CustomerDao.getInstanceof();
		customerDao.add(aymen);

	}

}
