/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.java.hr.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import src.com.java.hr.model.HrsEmployees;

/**
 *
 * @author Amr Akram
 */
public class HrsEmployeeDao
{
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
    public List getAllEmployees()
    {
        Session session = sessionFactory.openSession();
        return session.createQuery("From HrsEmployees").list();
    }
    
    public void addEmployee(HrsEmployees employee)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
    }
    
    public void deleteEmployee(HrsEmployees employee)
    {
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         session.delete(employee);
         session.getTransaction().commit();
    }
}
