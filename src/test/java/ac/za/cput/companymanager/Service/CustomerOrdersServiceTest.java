package ac.za.cput.companymanager.Service;

import ac.za.cput.companymanager.App;
import ac.za.cput.companymanager.Factory.CustomerFactory;
import ac.za.cput.companymanager.Factory.OrderFactory;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.repository.CustomerRepository;
import org.junit.Assert;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

import java.util.ArrayList;
import java.util.List;

@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class CustomerOrdersServiceTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private OrderService service;
    private Long id;

    @Autowired
    private CustomerRepository customerRepository;
    private List<Orders> ordersList;

    @Test
    public void create() throws Exception {

        ordersList = new ArrayList<>();

        Orders orders1 = OrderFactory.createOrder("12-3-2015", 300.00, null);
        Orders orders2 = OrderFactory.createOrder("10-2-2015", 1500.00, null);
        ordersList.add(orders1);
        ordersList.add(orders2);

        Customer customer = CustomerFactory.createCustomer("Riyaaz", "Rawoot", "Steenberg", "021702115522","gmail", ordersList);

        customerRepository.save(customer);
        id = customer.getCustomerID();

        Assert.assertNotNull(id);

    }
}
