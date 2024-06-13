package com.railworld.MappingTheory;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       
        
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        
        Students s= new Students();
        Students s2= new Students();
        
        Laptop l = new Laptop();
        l.setLid(50);
        l.setLname("dell");
        
        s.setMarks(90);
        s.setId(100);
        s.setSname("Jaadu");
        s.setLap(l);
        
        Laptop l2 = new Laptop();
        l2.setLid(59);
        l2.setLname("Hp");
        
        s2.setMarks(80);
        s2.setId(170);
        s2.setSname("Gandu");
        s2.setLap(l2);
        
        
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
       
        session.persist(s);
        session.persist(s2);
        session.persist(l);
        session.persist(l2);
        
        
        tx.commit();
    	session.close();
    	sf.close();
    	System.out.println("data saved");
    }
}
