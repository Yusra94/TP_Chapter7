package ac.za.cput.companymanager.Model;

import ac.za.cput.companymanager.domain.Orders;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

public class CustomerResource extends ResourceSupport{

    private Long idCustomer;
    private String nameCustomer;
    private List<Orders>  ordersListCustomer;

    public CustomerResource() {

    }

    public CustomerResource(Builder builder) {
        this.idCustomer = builder.idCustomer;
        this.nameCustomer = builder.nameCustomer;
        this.ordersListCustomer = builder.ordersListCustomer;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public List<Orders> getOrdersListCustomer() {
        return ordersListCustomer;
    }



    public static class Builder
    {
        private Long idCustomer;
        private String nameCustomer;
        private List<Orders>  ordersListCustomer;

        public Builder(String value) {

           this.nameCustomer = value;
        }

        public Builder iDCustomer(Long value)
        {
            this.idCustomer = value;
            return this;
        }

        public Builder orderListCustomer(List<Orders> value)
        {
            this.ordersListCustomer = value;
            return this;
        }

        public Builder copy(CustomerResource value)
        {
            this.nameCustomer = value.nameCustomer;
            this.idCustomer = value.idCustomer;
            this.ordersListCustomer = value.ordersListCustomer;
            return  this;
        }

        public CustomerResource build()
        {
            return new CustomerResource(this);
        }
    }

}
