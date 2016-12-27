package com.javatpoint.mypackage;  
  
import org.hibernate.*;  
import org.hibernate.cfg.*; 
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
public static void main(String[] args) {  
      
    Session session = new AnnotationConfiguration()
    	.configure().buildSessionFactory().openSession();  
    
    Transaction t=session.beginTransaction();  
    
          
    Employee e1=new Employee();  
    e1.setId(1001);  
    e1.setFirstName("Sachin");  
    e1.setLastName("Patil");  
    
    Employee e2=new Employee();  
    e2.setId(10002);  
    e2.setFirstName("Sachin");  
    e2.setLastName("Patil");  
      
    session.persist(e1);//persisting the object  
    session.persist(e2);
    
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  