package org.aarti.main;


import org.aarti.hibernate.dao.Address;
import org.aarti.hibernate.dao.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
//		user.setUserId();
		user.setUserName("shubham");
		Address addr = new Address();
		addr.setStreet("Panchkula");
		addr.setCity("Chandigarh");
		addr.setState("Haryana");
		addr.setPincode("1000001");
		
		Address addr1 = new Address();
		addr1.setStreet("Goa");
		addr1.setState("Maharastra");
		addr1.setCity("Mumbai");
		addr1.setPincode("200001");
		
		user.getListOfAddresss().add(addr);
		user.getListOfAddresss().add(addr1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
      
        
        /*user =null;
        session= sessionFactory.openSession();
	    session.beginTransaction();
	   user=(UserDetails)(session.get(UserDetails.class, 1));
	System.out.println("usename "+ user.getUserName());*/
	
	
	
	}

}
