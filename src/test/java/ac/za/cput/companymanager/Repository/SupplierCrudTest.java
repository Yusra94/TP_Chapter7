package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.Factory.SupplierFactory;
import ac.za.cput.companymanager.domain.Supplier;
import ac.za.cput.companymanager.repository.SupplierRepository;
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
public class SupplierCrudTest extends AbstractTestNGSpringContextTests {

    long id;
    //@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    SupplierRepository repository;

    @Test
    public void insert() throws Exception {

        Supplier supplier1 = SupplierFactory.createSupplier("Johnson's Laundry", "Riebeek Street", "JL@gmail", "0214478869", null);
        repository.save(supplier1);

        Supplier supplier2 = SupplierFactory.createSupplier("Clean Stuff", "Searle Street", "CS@gmail", "0214478869", null);
        repository.save(supplier2);

        Supplier supplier3 = SupplierFactory.createSupplier("Clean Freak", "Keizergracht Street", "CF@gmail", "0214475698", null);
        repository.save(supplier3);

        id = supplier3.getSupplierId();

        Assert.assertEquals("Johnson's Laundry",supplier1.getSupplierName());
        Assert.assertEquals("Riebeek Street",supplier1.getSupplierAddress());
        Assert.assertEquals("JL@gmail",supplier1.getSupplierEmail());
        Assert.assertEquals("0214478869",supplier1.getSupplierPhoneNumber());

        Assert.assertEquals("Clean Stuff",supplier2.getSupplierName());
        Assert.assertEquals("Searle Street",supplier2.getSupplierAddress());
        Assert.assertEquals("CS@gmail",supplier2.getSupplierEmail());
        Assert.assertEquals("0214478869",supplier2.getSupplierPhoneNumber());

        Assert.assertEquals("Clean Freak",supplier3.getSupplierName());
        Assert.assertEquals("Keizergracht Street",supplier3.getSupplierAddress());
        Assert.assertEquals("CF@gmail",supplier3.getSupplierEmail());
        Assert.assertEquals("0214475698",supplier3.getSupplierPhoneNumber());



    }

    @Test(dependsOnMethods = "insert")
    public void read() throws Exception {

        Supplier supplier = repository.findOne(id);

        Assert.assertEquals("Clean Freak",supplier.getSupplierName());
        Assert.assertEquals("Keizergracht Street",supplier.getSupplierAddress());
        Assert.assertEquals("CF@gmail",supplier.getSupplierEmail());
        Assert.assertEquals("0214475698",supplier.getSupplierPhoneNumber());

    }

    /*@Test
    public void update() throws Exception {

    }*/

    /*@Test
    public void delete() throws Exception {

        Supplier supplier = repository.findOne(id);
        repository.delete(id);
    }*/
}
