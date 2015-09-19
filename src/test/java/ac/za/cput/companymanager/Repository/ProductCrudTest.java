package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.Factory.ProductFactory;
import ac.za.cput.companymanager.domain.Product;
import ac.za.cput.companymanager.repository.ProductRepository;


import org.junit.Assert;

import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import ac.za.cput.companymanager.App;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ProductCrudTest extends AbstractTestNGSpringContextTests {

    private long id;

    @Autowired
    private ProductRepository repository;

    @Test
    public void insert() throws Exception {

        Product product1 = ProductFactory.createProduct("Bleach", 8, 28.00,25.60, null);
        repository.save(product1);

        Product product2 = ProductFactory.createProduct("Dishwasher", 2, 25.00,22.00, null);
        repository.save(product2);

        Product product3 = ProductFactory.createProduct("Floor cleaner", 13, 22.50,20.10, null);
        repository.save(product3);

        id = product2.getProductNumber();
        Assert.assertEquals("Bleach", product1.getProductName());
        Assert.assertEquals(8, product1.getQty());
        Assert.assertEquals(28.00, product1.getSellingPrice(),2);
        Assert.assertEquals(25.60, product1.getCost(),2);

        Assert.assertEquals("Dishwasher", product2.getProductName());
        Assert.assertEquals(2, product2.getQty());
        Assert.assertEquals(25.00, product2.getSellingPrice(),2);
        Assert.assertEquals(22.00, product2.getCost(),2);


        Assert.assertEquals("Floor cleaner", product3.getProductName());
        Assert.assertEquals(13, product3.getQty());
        Assert.assertEquals(22.50, product3.getSellingPrice(),2);
        Assert.assertEquals(20.10, product3.getCost(),2);


    }

    @Test(dependsOnMethods = "insert")
    public void read() throws Exception {

       Product product =  repository.findOne(id);

        Assert.assertEquals("Dishwasher", product.getProductName());
        Assert.assertEquals(2, product.getQty());
        Assert.assertEquals(25.00, product.getSellingPrice(),2);
        Assert.assertEquals(22.00, product.getCost(),2);

    }

    /*@Test
    public void update() throws Exception {

    }*/

   /* @Test(dependsOnMethods = "read")
    public void delete() throws Exception {

        Product product = repository.findOne(id);
        repository.delete(product);

    }*/
}
