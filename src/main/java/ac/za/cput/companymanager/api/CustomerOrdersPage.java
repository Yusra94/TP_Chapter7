package ac.za.cput.companymanager.api;

import ac.za.cput.companymanager.Model.CustomerResource;
import ac.za.cput.companymanager.Service.CustomerService;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/orders/**")
public class CustomerOrdersPage {

    @Autowired
    private CustomerService service;
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public List<Orders> getCustomerOrders(@PathVariable Long id)
    {
        //List<CustomerResource> hateos = new ArrayList<>();

       // List<Orders> customerOrders = new ArrayList<>();

        return service.getOrders(id);


//        return service.getAllOrders(id);
    }

    @RequestMapping(value="/customerorders", method=RequestMethod.GET)

    public List<CustomerResource> getCustomers() {
        List<CustomerResource> hateos = new ArrayList<>();
        List<Customer> customers = service.getCustomer();
        for (Customer customer : customers) {
            CustomerResource res = new CustomerResource.Builder("Yusra").orderListCustomer(null).build();
            org.springframework.hateoas.Link orders = new
                    org.springframework.hateoas.Link("http://localhost:8080/orders/"+res.getIdCustomer())
                    .withRel("ordes");
            res.add(orders);
            hateos.add(res);
        }
        return hateos;
    }


}
