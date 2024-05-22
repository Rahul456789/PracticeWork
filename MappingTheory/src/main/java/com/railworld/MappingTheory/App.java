package com.railworld.MappingTheory;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop l = new Laptop();
        l.setId(50);
        l.setLname("dell");
        
        Students s= new Students();
        
        s.setMarks(90);
        s.setId(50);
        s.setSname("Jaadu");
        s.setLap(l);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(l);
        session.save(s);
        
        tx.commit();
    	session.close();
    	sf.close();
    	System.out.println("data saved");
    }
}
