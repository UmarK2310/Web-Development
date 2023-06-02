package Hibernate.OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Hibernate.OnetoOne.Phone;
import Hibernate.OnetoOne.UserDetails;
public class App {

public static void main(String[] args)
{
UserDetails user = new UserDetails(); 
Phone phone= new Phone(); 
phone.setSP("Airtel");
user.setUserName("Umar Khan");
user.setPhone(phone);

Configuration config = new Configuration();
config.configure();

SessionFactory sessionFactory = config.buildSessionFactory();
Session session = sessionFactory.openSession(); 
session.beginTransaction();
session.save(phone);
session.save(user);
session.getTransaction().commit(); 
session.close(); 
}
}
