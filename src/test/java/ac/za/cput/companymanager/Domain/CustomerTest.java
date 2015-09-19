package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.Factory.CustomerFactory;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.domain.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/24.
 */
public class CustomerTest {

    Customer customer;
    Orders orders;
    List<Orders> ordersList;
    List<Product> productList;
    List<Product> productList1;
    List<Orders> ordersList1;
    Customer customer2;
    Orders orders1;


    @Before
    public void setUp() throws Exception {

        productList = new ArrayList<Product>();
        productList.add(new Product.Builder("Chlorine").itemQty(5).productCost(50.00).productSellingPrice(80.00).build());
        productList.add(new Product.Builder("Dishwasher").itemQty(3).productCost(22.00).productSellingPrice(36.00).build());

        orders = new Orders.Builder("15-2-2014").totalSales(300.00).productList(productList).build();
        ordersList = new ArrayList<Orders>();
        ordersList.add(orders);

        customer = CustomerFactory.createCustomer("Yusra", "Ismail", "22 Leeubekkie", "0768954126","yusraismail17@gmail.com", ordersList);
        //customer = new Customer.Builder(12345).customerName("Harry").customerSurname("Potter").customerAddress("Hogwarts").emailAddress("HarryP@yahoo.com").phoneNumber("55512345").orderList(ordersList).build();

    }

    @Test
    public void testCustomerName() throws Exception {

        Assert.assertEquals("Yusra", customer.getCustomerName());
    }

    @Test
    public void testCustomerSurname() throws Exception {

        Assert.assertEquals("Ismail", customer.getCustomerSurname());
    }

    @Test
    public void testCustomerAddress() throws Exception {

        Assert.assertEquals("22 Leeubekkie", customer.getCustomerAddress());
    }

    @Test
    public void testCustomerEmail() throws Exception {

        Assert.assertEquals("yusraismail17@gmail.com", customer.getCutomerEmailAddress());
    }

    @Test
    public void testCustomerPhone() throws Exception {

        Assert.assertEquals("0768954126", customer.getCustomerPhoneNumber());
    }

    @Test
    public void testCustomerOrdersList() throws Exception {

        Assert.assertEquals(ordersList, customer.getOrderses());

    }
}
