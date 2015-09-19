package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.Factory.ShipmentFactory;
import ac.za.cput.companymanager.domain.Shipment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/24.
 */
public class ShipmentTest {

    Shipment shipment;

    @Before
    public void setUp() throws Exception {

        shipment = ShipmentFactory.createShipment("13-05-2015","Mike Johnson");

    }

    @Test
    public void testShipment() throws Exception {

        Assert.assertEquals("13-05-2015", shipment.getDate());
        Assert.assertEquals("Mike Johnson",shipment.getDriver());

    }
}
