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
import src.com.java.hr.model.HrsDepartment;

/**
 *
 * @author Amr Akram
 */
@ManagedBean
@ViewScoped
public class DepartmentBean
{

    private BigDecimal departmentPk;
    private String departmentName;
    private HrDepartmentDao departmentDao = new HrDepartmentDao();
    private HrsDepartment currentDepartment = new HrsDepartment();

    public BigDecimal getDepartmentPk()
    {
        return departmentPk;
    }

    public void setDepartmentPk(BigDecimal departmentPk)
    {
        this.departmentPk = departmentPk;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public HrsDepartment getCurrentDepartment()
    {
        return currentDepartment;
    }

    public void setCurrentDepartment(HrsDepartment currentDepartment)
    {
        this.currentDepartment = currentDepartment;
    }

    @PostConstruct
    public void init()
    {

    }

    public String saveDepartment()
    {
        return "index.xhtml";
    }
}
