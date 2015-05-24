package ac.za.cput.company_manager.Domain;

import ac.za.cput.company_manager.Factory.RawMaterialFactory;
import ac.za.cput.company_manager.domain.RawMaterial;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RawMaterialTest {

    RawMaterial rawMaterial;

    @Before
    public void setUp() throws Exception {
        //rawMaterial = new RawMaterial.Builder(99).rawMaterialName("Chloro").rawMaterialQtyOnHand(8).rawMatrialCost(105.50).build();
        rawMaterial = RawMaterialFactory.createRawMaterial("Chloro",105.50,8);
    }


    @Test
    public void testName() throws Exception {

        Assert.assertEquals("Chloro", rawMaterial.getRawMaterialName());
    }

    @Test
    public void testQty() throws Exception {

        Assert.assertEquals(8,rawMaterial.getRawMaterialQtyOnHand());
    }

    @Test
    public void testCost() throws Exception {

        Assert.assertEquals(105.50,rawMaterial.getRawMaterialCost(),2);
    }
}
