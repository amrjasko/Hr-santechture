/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.java.hr.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import src.com.java.hr.dao.HrDepartmentDao;
import src.com.java.hr.dao.HrsEmployeeDao;
import src.com.java.hr.model.HrsDepartment;
import src.com.java.hr.model.HrsEmployees;

/**
 *
 * @author Amr Akram
 */
@ManagedBean
@ViewScoped
public class MyBean implements Serializable
{

    private static final long serialVersionUID = 1;

    private HrDepartmentDao departmentDao = new HrDepartmentDao();
    private HrsEmployeeDao employeeDao = new HrsEmployeeDao();

    private String firstName;

    private String lastName;

    private String selectedDepartment;

    private List<HrsDepartment> departments;

    private List<HrsEmployees> employees;

    public List<HrsEmployees> getEmployees()
    {
        return employees;
    }

    public void setEmployees(List<HrsEmployees> employees)
    {
        this.employees = employees;
    }

    public List<HrsDepartment> getDepartments()
    {
        return departments;
    }

    public void setDepartments(List<HrsDepartment> departments)
    {
        this.departments = departments;
    }

    public String getSelectedDepartment()
    {
        return selectedDepartment;
    }

    public void setSelectedDepartment(String selectedDepartment)
    {
        this.selectedDepartment = selectedDepartment;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @PostConstruct
    public void init()
    {
        departments = departmentDao.getAllDepartments();
        employees  = employeeDao.getAllEmployees();
    }

}
