package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.Factory.OrderFactory;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/24.
 */
public class OrdersTest {

    Orders orders;
    Product product;
    List<Product> productList;

    @Before
    public void setUp() throws Exception {

        product = new Product.Builder("Product1").itemQty(2).productSellingPrice(50.00).productCost(25.00).build();
        productList = new ArrayList<Product>();
        productList.add(product);
        //orders = new Orders.Builder(12345).totalSales(1500).orderDate("25-02-2015").productList(productList).build();

        orders = OrderFactory.createOrder("25-02-2015", 1500.00, productList);

    }

    @Test
    public void testTotalSales() throws Exception {
        org.junit.Assert.assertEquals(1500.00, orders.getTotalSales(),2);

    }

    @Test
    public void testOrderDate() throws Exception {
        org.junit.Assert.assertEquals("25-02-2015", orders.getOrderDate());

    }

    @Test
    public void testOrderList() throws Exception {

        org.junit.Assert.assertEquals(productList, orders.getProductList());

    }
}
