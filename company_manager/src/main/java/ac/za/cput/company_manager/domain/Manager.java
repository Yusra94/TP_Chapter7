package ac.za.cput.companymanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Manager implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long managerId;
    private String managerName;
    private String managerSurname;

    public Manager() {
    }

    public Manager(Builder builder) {
        this.managerId = builder.managerId;
        this.managerName = builder.managerName;
        this.managerSurname = builder.managerSurname;
    }

    public long getManagerId() {
        return managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getManagerSurname() {
        return managerSurname;
    }

    public static class Builder
    {

        private long managerId;
        private String managerName;
        private String managerSurname;

        public Builder(long id) {

            this.managerId = id;
        }

        public Builder managerName(String name)
        {
            this.managerName = name;
            return this;
        }

        public Builder managerSurname(String surname)
        {
            this.managerSurname = surname;
            return this;
        }

        public Builder copy(Manager value)
        {
            this.managerId = value.managerId;
            this.managerName = value.managerName;
            this.managerSurname = value.managerSurname;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }

}
