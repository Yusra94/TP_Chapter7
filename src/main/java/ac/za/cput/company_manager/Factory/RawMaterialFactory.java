package ac.za.cput.company_manager.Factory;

import ac.za.cput.company_manager.domain.RawMaterial;


public class RawMaterialFactory {

    public static RawMaterial createRawMaterial(String rawMaterialName, double rawMaterialCost, int qtyOnHand)
    {

        RawMaterial rawMaterial = new RawMaterial.Builder(rawMaterialName).rawMatrialCost(rawMaterialCost).rawMaterialQtyOnHand(qtyOnHand).build();
        return  rawMaterial;
    }
}
