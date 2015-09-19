package ac.za.cput.companymanager.Factory;

import ac.za.cput.companymanager.domain.Product;
import ac.za.cput.companymanager.domain.RawMaterial;

import java.util.List;

public class ProductFactory {

    public static Product createProduct(String productName, int productQty,double sellingPrice, double cost, List<RawMaterial> rawMaterialList)
    {
        Product product = new Product.Builder(productName).itemQty(productQty).productSellingPrice(sellingPrice).productCost(cost).rawMaterialist(rawMaterialList).build();
        return product;
    }
}
