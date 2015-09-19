package ac.za.cput.companymanager.Factory;

import ac.za.cput.companymanager.domain.RawMaterial;


public class RawMaterialFactory {

    public static RawMaterial createRawMaterial(String rawMaterialName, double rawMaterialCost, int qtyOnHand)
    {

        RawMaterial rawMaterial = new RawMaterial.Builder(rawMaterialName).rawMatrialCost(rawMaterialCost).rawMaterialQtyOnHand(qtyOnHand).build();
        return  rawMaterial;
    }
}
