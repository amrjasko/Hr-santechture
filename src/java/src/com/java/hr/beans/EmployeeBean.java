/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.java.hr.beans;

import java.math.BigDecimal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
public class EmployeeBean
{
    
    private BigDecimal empPk;
    private HrsDepartment hrsDepartment;
    private BigDecimal empNationalFk;
    private String empName;
    private BigDecimal empSalary;
    private HrDepartmentDao departmentDao = new HrDepartmentDao();
    private String selectedDepartment;
    private List<HrsDepartment> departments;
    private HrsEmployeeDao employeeDao = new HrsEmployeeDao();
    private HrsEmployees currentEmployee = new HrsEmployees();
    
    public BigDecimal getEmpPk()
    {
        return empPk;
    }
    
    public void setEmpPk(BigDecimal empPk)
    {
        this.empPk = empPk;
    }
    
    public HrsDepartment getHrsDepartment()
    {
        return hrsDepartment;
    }
    
    public void setHrsDepartment(HrsDepartment hrsDepartment)
    {
        this.hrsDepartment = hrsDepartment;
    }
    
    public BigDecimal getEmpNationalFk()
    {
        return empNationalFk;
    }
    
    public void setEmpNationalFk(BigDecimal empNationalFk)
    {
        this.empNationalFk = empNationalFk;
    }
    
    public String getEmpName()
    {
        return empName;
    }
    
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    
    public BigDecimal getEmpSalary()
    {
        return empSalary;
    }
    
    public void setEmpSalary(BigDecimal empSalary)
    {
        this.empSalary = empSalary;
    }
    
    public HrDepartmentDao getDepartmentDao()
    {
        return departmentDao;
    }
    
    public void setDepartmentDao(HrDepartmentDao departmentDao)
    {
        this.departmentDao = departmentDao;
    }
    
    public String getSelectedDepartment()
    {
        return selectedDepartment;
    }
    
    public void setSelectedDepartment(String selectedDepartment)
    {
        this.selectedDepartment = selectedDepartment;
    }
    
    public List<HrsDepartment> getDepartments()
    {
        return departments;
    }
    
    public void setDepartments(List<HrsDepartment> departments)
    {
        this.departments = departments;
    }

    public HrsEmployees getCurrentEmployee()
    {
        return currentEmployee;
    }

    public void setCurrentEmployee(HrsEmployees currentEmployee)
    {
        this.currentEmployee = currentEmployee;
    }
    
    
    @PostConstruct
    public void init()
    {
        departments = departmentDao.getAllDepartments();
    }
    
    public String saveEmployee()
    {
        currentEmployee.setEmpName(getEmpName());
        currentEmployee.setEmpNationalFk(getEmpNationalFk());
        currentEmployee.setEmpPk(getEmpPk());
        currentEmployee.setEmpSalary(getEmpSalary());
        //currentEmployee.setHrsDepartment();
        employeeDao.addEmployee(currentEmployee);
        return "index.xhtml";
    }
}
