package ac.za.cput.companymanager.domain;



import javax.persistence.*;
import java.util.List;

@Entity
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;
    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String CustomerPhoneNumber;
    private String customerEmailAddress;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="order_customerID")
    private List<Orders> orderses;

    public Customer()
    {}

    public Customer(Builder builder) {
        this.customerID = builder.customerID;
        this.customerName = builder.customerName;
        this.customerSurname = builder.customerSurname;
        this.customerAddress = builder.customerAddress;
        this.CustomerPhoneNumber = builder.customerPhoneNumber;
        this.customerEmailAddress = builder.customerEmailAddress;
        this.orderses = builder.orderses;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public String getCutomerEmailAddress() {
        return customerEmailAddress;
    }

    public  List<Orders> getOrderses(){return orderses;}

    public static class Builder
    {
        private Long customerID;
        private String customerName;
        private String customerSurname;
        private String customerAddress;
        private String customerPhoneNumber;
        private String customerEmailAddress;
        private List<Orders> orderses;

        public Builder(String name)
        {
            this.customerName = name;
        }

       /* public Builder customerName(String name){

            this.customerName = name;
            return this;
        }*/
        public Builder customerSurname(String surname){

            this.customerSurname = surname;
            return this;
        }

        public Builder customerAddress( String address){

            this.customerAddress = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){

            this.customerPhoneNumber = phoneNumber;
            return this;
        }

        public Builder emailAddress(String email){

            this.customerEmailAddress = email;
            return this;
        }

        public Builder orderList(List<Orders> value)
        {
            this.orderses = value;
            return this;
        }

        public Builder copy(Customer value)
        {
            this.customerID = value.customerID;
            this.customerName = value.customerName;
            this.customerAddress = value.customerAddress;
            this.customerEmailAddress = value.customerEmailAddress;
            this.customerPhoneNumber = value.CustomerPhoneNumber;
            this.orderses = value.orderses;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }


    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return customerID.equals(customer.customerID);
    }

    @Override
    public int hashCode()
    {
        return customerID.hashCode();
    }

    @Override
    public String toString()
    {
        return "Name: " + customerName + "" + "Surname: " + customerSurname;
    }
}
