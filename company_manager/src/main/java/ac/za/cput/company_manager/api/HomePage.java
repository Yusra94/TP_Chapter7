package ac.za.cput.companymanager.api;

import ac.za.cput.companymanager.Service.CustomerService;
import ac.za.cput.companymanager.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private CustomerService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public Customer getCCustomer(){
        Customer cust = new Customer.Builder("Yusra").build();

        return cust;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){


        return service.getCustomer();
    }




}
