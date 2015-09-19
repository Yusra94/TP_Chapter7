package ac.za.cput.companymanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class FactoryWorker implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String employeeName;
    private String employeeSurname;
    private String hireDate;
    private double salary;

    public FactoryWorker() {
    }

    public FactoryWorker(Builder builder) {
        this.employeeID = builder.employeeID;
        this.employeeName = builder.employeeName;
        this.employeeSurname = builder.employeeSurname;
        this.hireDate = builder.hireDate;
        this.salary = builder.employeeSalary;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname(){return  employeeSurname;}

    public String getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public static class Builder
    {
        private long employeeID;
        private String employeeName;
        private String employeeSurname;
        private String hireDate;
        private double employeeSalary;

        public Builder(long id) {

            this.employeeID = id;
        }

        public Builder employeeSurname(String surname)
        {
            this.employeeSurname = surname;
            return this;
        }

        public Builder employeeName(String name)
        {
            this.employeeName = name;
            return this;
        }

        public Builder employeeHireDate(String hireDate)
        {
            this.hireDate = hireDate;
            return this;
        }

        public Builder employeeSalary(double salary)
        {
            this.employeeSalary = salary;
            return this;
        }


        public Builder copy(FactoryWorker value)
        {
            this.employeeID = value.employeeID;
            this.employeeName = value.employeeName;
            this.employeeSurname = value.employeeSurname;
            this.employeeSalary = value.salary;
            this.hireDate = value.hireDate;
            return this;
        }

        public FactoryWorker build()
        {
            return new FactoryWorker(this);
        }
    }
}
