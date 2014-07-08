package tn.edu.esprit.cinfo2.zanga.goldenCage.test;

import java.sql.Date;

import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Customer;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans.Provider;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl.CustomerDao;
import tn.edu.esprit.cinfo2.zanga.goldenCage.domain.daoImpl.ProviderDao;

public class TestUser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Customer aymen = new Customer();

		aymen.setLastname("Ghoul");
		aymen.setFirstname("Aymen");
		aymen.setEmail("aymen22@tanitweb.com");
		aymen.setPassword("123456");
		Date date = new Date(0, 0, 0);
		aymen.setDate_wedding(date);

		System.out.println(aymen);

		CustomerDao customerDao = CustomerDao.getInstanceof();
		// customerDao.add(aymen);
		Provider troupe = new Provider();

		troupe.setFirstname("Bou dinar");
		troupe.setPassword("123456");
		troupe.setLastname("Troupe");
		troupe.setEmail("troupeboudinar@esprit.tn");
		troupe.setAdresse("Tunis");
		troupe.setReason_social("1542-88715");
		troupe.setTel("23726584");
		troupe.setImage("image");
		System.out.println(troupe);
		ProviderDao providerDao = ProviderDao.getInstanceof();

		// providerDao.add(troupe);
		Provider provider = providerDao.findById(7);
		System.out.println(provider);
		provider.setPassword(provider.getPassword());
		System.out.println(provider.getPassword());
		providerDao.update(provider);
		providerDao.remove(provider);
	}

}
