package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.App;
import ac.za.cput.companymanager.Factory.ShipmentFactory;
import ac.za.cput.companymanager.domain.Shipment;
import ac.za.cput.companymanager.repository.ShipmentRepository;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ShipmentCrudTest extends AbstractTestNGSpringContextTests {

    long id;

    @Autowired
    ShipmentRepository repository;

    @Test
    public void insert() throws Exception {

        Shipment shipment1 = ShipmentFactory.createShipment("05-06-2014", "Mohammad Isaacs");
        repository.save(shipment1);

        Shipment shipment2 = ShipmentFactory.createShipment("13-03-2015", "Mohammad Isaacs");
        repository.save(shipment2);

        Shipment shipment3 = ShipmentFactory.createShipment("06-01-2015", "Michael Johnson");
        repository.save(shipment3);

        id = shipment3.getOrderNumber();

        Assert.assertEquals("05-06-2014", shipment1.getDate());
        Assert.assertEquals("Mohammad Isaacs", shipment1.getDriver());

        Assert.assertEquals("13-03-2015", shipment2.getDate());
        Assert.assertEquals("Mohammad Isaacs", shipment2.getDriver());

        Assert.assertEquals("06-01-2015", shipment3.getDate());
        Assert.assertEquals("Michael Johnson", shipment3.getDriver());
    }

    @Test(dependsOnMethods = "insert")
    public void read() throws Exception {

        Shipment shipment = repository.findOne(id);

        Assert.assertNotNull(shipment.getOrderNumber());
        Assert.assertEquals("06-01-2015", shipment.getDate());
        Assert.assertEquals("Michael Johnson", shipment.getDriver());
    }

    /*@Test
    public void update() throws Exception {


    }*/

   /* @Test(dependsOnMethods = "read")
    public void delete() throws Exception {

        Shipment shipment = repository.findOne(id);
        repository.delete(shipment);

    }*/
}
