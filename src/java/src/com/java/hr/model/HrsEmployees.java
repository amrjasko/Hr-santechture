package src.com.java.hr.model;
// Generated Mar 12, 2023 8:28:32 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HrsEmployees generated by hbm2java
 */
@Entity
@Table(name = "HRS_EMPLOYEES",
         schema = "HR_SERVE"
)
public class HrsEmployees implements java.io.Serializable
{

    private BigDecimal empPk;
    private HrsDepartment hrsDepartment;
    private BigDecimal empNationalFk;
    private String empName;
    private BigDecimal empSalary;

    public HrsEmployees()
    {
    }

    public HrsEmployees(BigDecimal empPk)
    {
        this.empPk = empPk;
    }

    public HrsEmployees(BigDecimal empPk, HrsDepartment hrsDepartment, BigDecimal empNationalFk, String empName, BigDecimal empSalary)
    {
        this.empPk = empPk;
        this.hrsDepartment = hrsDepartment;
        this.empNationalFk = empNationalFk;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_PK", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getEmpPk()
    {
        return this.empPk;
    }

    public void setEmpPk(BigDecimal empPk)
    {
        this.empPk = empPk;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_DEPT_FK")
    public HrsDepartment getHrsDepartment()
    {
        return this.hrsDepartment;
    }

    public void setHrsDepartment(HrsDepartment hrsDepartment)
    {
        this.hrsDepartment = hrsDepartment;
    }

    @Column(name = "EMP_NATIONAL_FK", precision = 22, scale = 0)
    public BigDecimal getEmpNationalFk()
    {
        return this.empNationalFk;
    }

    public void setEmpNationalFk(BigDecimal empNationalFk)
    {
        this.empNationalFk = empNationalFk;
    }

    @Column(name = "EMP_NAME", length = 100)
    public String getEmpName()
    {
        return this.empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    @Column(name = "EMP_SALARY", precision = 22, scale = 0)
    public BigDecimal getEmpSalary()
    {
        return this.empSalary;
    }

    public void setEmpSalary(BigDecimal empSalary)
    {
        this.empSalary = empSalary;
    }

}