package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.Factory.OrderFactory;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.repository.OrderRepository;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import ac.za.cput.companymanager.App;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class OrdersCrudTest extends AbstractTestNGSpringContextTests {

    long id;
   // @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    OrderRepository repository;

    @Test
    public void insert() throws Exception {

        Orders order1 = OrderFactory.createOrder("05-02-2015", 300.00, null);
        repository.save(order1);

        Orders order2 = OrderFactory.createOrder("23-03-2015", 1024.80, null);
        repository.save(order2);

        Orders order3 = OrderFactory.createOrder("25-04-2015", 926.40, null);
        repository.save(order3);

        id = order3.getOrderNumber();
        Assert.assertEquals("05-02-2015", order1.getOrderDate());
        Assert.assertEquals(300.00, order1.getTotalSales());

        Assert.assertEquals("23-03-2015", order2.getOrderDate());
        Assert.assertEquals(1024.80, order2.getTotalSales());

        Assert.assertEquals("25-04-2015", order3.getOrderDate());
        Assert.assertEquals(926.40, order3.getTotalSales());

    }

    @Test(dependsOnMethods = "insert")
    public void read() throws Exception {

        Orders orders = repository.findOne(id);
        Assert.assertEquals(id, orders.getOrderNumber());
        Assert.assertEquals("25-04-2015",orders.getOrderDate());
        Assert.assertEquals(926.40, orders.getTotalSales());

    }
    /*
    @Test
    public void update() throws Exception {

    }*/

   /* @Test (dependsOnMethods = "read")
    public void delete() throws Exception {

        Orders orders = repository.findOne(id);
        repository.delete(orders);


    }*/
}
