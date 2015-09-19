package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.Factory.ProductFactory;
import ac.za.cput.companymanager.domain.Product;
import ac.za.cput.companymanager.domain.RawMaterial;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    List<RawMaterial> rawMaterialList;
    RawMaterial rawMaterial;
    Product product;

    @Before
    public void setUp() throws Exception {
        rawMaterialList = new ArrayList<RawMaterial>();
        rawMaterial = new RawMaterial.Builder("rawMaterial1").rawMaterialQtyOnHand(15).rawMatrialCost(185.00).build();
        rawMaterialList.add(rawMaterial);
        //product = new Product.Builder(128).productName("product1").itemQty(5).productCost(328.00).productSellingPrice(500.00).rawMaterialist(rawMaterialList).build();
        product = ProductFactory.createProduct("Bleach",5,500,328, rawMaterialList);
    }

    @Test
    public void testProductName() throws Exception {

        Assert.assertEquals("Bleach", product.getProductName());
    }

    @Test
    public void testProductQty() throws Exception {

        Assert.assertEquals(5,product.getQty());
    }

    @Test
    public void testProductCost() throws Exception {

        Assert.assertEquals(328, product.getCost(), 2);
    }

    @Test
    public void testProductSellingPrice() throws Exception {

        Assert.assertEquals(500.00, product.getSellingPrice(),2);
    }

    @Test
    public void testRawMaterialList() throws Exception {

        Assert.assertEquals(rawMaterialList, product.getRawMaterialList());
    }
}
