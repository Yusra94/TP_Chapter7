package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.Factory.CustomerFactory;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.repository.CustomerRepository;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import ac.za.cput.companymanager.App;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class CustomerCrudTest extends AbstractTestNGSpringContextTests{

    long id;
    //@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    CustomerRepository repository;


    @Test
    public void insert() throws Exception {

        Customer customer1 = CustomerFactory.createCustomer("Yusra", "Ismail", "Home", "0768954126", "@gmail", null);
        repository.save(customer1);

        Customer customer2 = CustomerFactory.createCustomer("Miles", "Teller", "Washington", "5550123456", "@yahoo", null);
        repository.save(customer2);

        Customer customer3 = CustomerFactory.createCustomer("Harold", "Barnes", "Sydney, Australia", "999223455", "@hotmail", null);
        repository.save(customer3);

        id = customer2.getCustomerID();
        Assert.assertNotNull(customer1.getCustomerID());
        Assert.assertEquals("Yusra", customer1.getCustomerName());
        Assert.assertEquals("Ismail", customer1.getCustomerSurname());
        Assert.assertEquals("Home", customer1.getCustomerAddress());
        Assert.assertEquals("0768954126", customer1.getCustomerPhoneNumber());
        Assert.assertEquals("@gmail", customer1.getCutomerEmailAddress());

        Assert.assertNotNull(customer2.getCustomerID());
        Assert.assertEquals("Miles", customer2.getCustomerName());
        Assert.assertEquals("Teller", customer2.getCustomerSurname());
        Assert.assertEquals("Washington", customer2.getCustomerAddress());
        Assert.assertEquals("5550123456", customer2.getCustomerPhoneNumber());
        Assert.assertEquals("@yahoo", customer2.getCutomerEmailAddress());

        Assert.assertNotNull(customer3.getCustomerID());
        Assert.assertEquals("Harold", customer3.getCustomerName());
        Assert.assertEquals("Barnes", customer3.getCustomerSurname());
        Assert.assertEquals("Sydney, Australia",customer3.getCustomerAddress());
        Assert.assertEquals("999223455", customer3.getCustomerPhoneNumber());
        Assert.assertEquals("@hotmail", customer3.getCutomerEmailAddress());

    }

    @Test(dependsOnMethods = "insert")
    public void read() throws Exception {

        Customer customer = repository.findOne(id);

       // Assert.assertEquals(id, customer.getCustomerID());
        Assert.assertEquals("Miles", customer.getCustomerName());
        Assert.assertEquals("Teller", customer.getCustomerSurname());
        Assert.assertEquals("Washington", customer.getCustomerAddress());
        Assert.assertEquals("5550123456", customer.getCustomerPhoneNumber());
        Assert.assertEquals("@yahoo", customer.getCutomerEmailAddress());

    }

   /* @Test
    public void update() throws Exception {

    }*/

    /*@Test(dependsOnMethods = "read")
    public void delete() throws Exception {

        Customer customer = repository.findOne(id);
        repository.delete(customer);

    }*/
}
