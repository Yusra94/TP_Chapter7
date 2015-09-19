package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.domain.RawMaterial;
import ac.za.cput.companymanager.repository.RawMaterialRepository;
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
public class RawMaterialCrudTest extends AbstractTestNGSpringContextTests {

    private long id;

    @Autowired
    private RawMaterialRepository repository;


    @Test
    public void insert() throws Exception {

        RawMaterial rawMaterial1 = new RawMaterial.Builder("Salt").rawMaterialQtyOnHand(5).rawMatrialCost(50.00).build();
        repository.save(rawMaterial1);

        RawMaterial rawMaterial2 = new RawMaterial.Builder("Phosphate").rawMaterialQtyOnHand(6).rawMatrialCost(88.50).build();
        repository.save(rawMaterial2);

        RawMaterial rawMaterial3 = new RawMaterial.Builder("Sodium").rawMaterialQtyOnHand(1).rawMatrialCost(23.30).build();
        repository.save(rawMaterial3);

        id = rawMaterial1.getRawMaterialId();
        Assert.assertNotNull(rawMaterial1.getRawMaterialId());
        Assert.assertEquals("Salt", rawMaterial1.getRawMaterialName());
        Assert.assertEquals(5, rawMaterial1.getRawMaterialQtyOnHand());
        Assert.assertEquals(50.00, rawMaterial1.getRawMaterialCost(),2);

        Assert.assertNotNull(rawMaterial2.getRawMaterialId());
        Assert.assertEquals("Phosphate", rawMaterial2.getRawMaterialName());
        Assert.assertEquals(6, rawMaterial2.getRawMaterialQtyOnHand());
        Assert.assertEquals(88.50, rawMaterial2.getRawMaterialCost(),2);

        Assert.assertNotNull(rawMaterial3.getRawMaterialId());
        Assert.assertEquals("Sodium", rawMaterial3.getRawMaterialName());
        Assert.assertEquals(1, rawMaterial3.getRawMaterialQtyOnHand());
        Assert.assertEquals(23.30, rawMaterial3.getRawMaterialCost(),2);
    }

    @Test(dependsOnMethods = "insert")
    public void read() throws Exception {


        RawMaterial rawMaterial = repository.findOne(id);
       /* Assert.assertNotNull(rawMaterial.getRawMaterialId());
        Assert.assertNotNull(rawMaterial.getRawMaterialName());
        Assert.assertNotNull(rawMaterial.getRawMaterialCost());
        Assert.assertNotNull(rawMaterial.getRawMaterialQtyOnHand());*/

        Assert.assertEquals("Salt",rawMaterial.getRawMaterialName());
        Assert.assertEquals(50.00, rawMaterial.getRawMaterialCost(),2);
        Assert.assertEquals(5,rawMaterial.getRawMaterialQtyOnHand());

    }
/*
    @Test
    public void update() throws Exception {

    }*/


   /* @Test(dependsOnMethods = "read")
    public void delete() throws Exception {

        RawMaterial rawMaterial = repository.findOne(id);
        repository.delete(rawMaterial);
        RawMaterial deletedRawMaterial = repository.findOne(id);
        Assert.assertNull(deletedRawMaterial);

    }*/
}
