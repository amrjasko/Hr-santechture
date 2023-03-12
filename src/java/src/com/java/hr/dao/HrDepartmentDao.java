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
import src.com.java.hr.model.HrsDepartment;

/**
 *
 * @author Amr Akram
 */
public class HrDepartmentDao
{

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public List<HrsDepartment> getAllDepartments()
    {
        Session session = sessionFactory.openSession();
        List list = session.createQuery("From HrsDepartment").list();
        list.forEach(System.out::println);
        return list;
    }

    public void addDepartment(HrsDepartment department)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(department);
        session.getTransaction().commit();
    }

    public void deleteDepartment(HrsDepartment department)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(department);
        session.getTransaction().commit();
    }
}
