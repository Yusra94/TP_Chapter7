package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.Factory.SupplierFactory;
import ac.za.cput.companymanager.domain.RawMaterial;
import ac.za.cput.companymanager.domain.Supplier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/24.
 */
public class SupplierTest {

    Supplier supplier;
    RawMaterial rawMaterial;
    List<RawMaterial> rawMaterialList;

    @Before
    public void setUp() throws Exception {

        rawMaterialList = new ArrayList<RawMaterial>();
        rawMaterial = new RawMaterial.Builder("rawMaterial1").rawMaterialQtyOnHand(5).rawMatrialCost(150.00).build();
        rawMaterialList.add(rawMaterial);
       // supplier = new Supplier.Builder(12345).supplierName("Sunlight").supplierAddress("Kengsington").supplierEmail("sunlight@gmail.com").supplierPhoneNumber("0219523654").rawMaterialList(rawMaterialList).build();
        supplier = SupplierFactory.createSupplier("Sunlight", "Kengsington","sunlight@gmail.com", "0219523654",rawMaterialList);
    }

    @Test
    public void testSupplierName() throws Exception {

        Assert.assertEquals("Sunlight", supplier.getSupplierName());
    }

    @Test
    public void testSupplierAddress() throws Exception {

        Assert.assertEquals("Kengsington", supplier.getSupplierAddress());
    }

    @Test
    public void testSupplierEmail() throws Exception {

        Assert.assertEquals("sunlight@gmail.com", supplier.getSupplierEmail());
    }

    @Test
    public void testSupplierPhone() throws Exception {

        Assert.assertEquals("0219523654", supplier.getSupplierPhoneNumber());
    }

    @Test
    public void testRawMaterialList() throws Exception {

        Assert.assertEquals(rawMaterialList, supplier.getRawMaterialList());

    }
}
