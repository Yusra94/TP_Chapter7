package ac.za.cput.company_manager.Factory;

import ac.za.cput.company_manager.domain.RawMaterial;
import ac.za.cput.company_manager.domain.Supplier;

import java.util.List;

public class SupplierFactory {

        public static Supplier createSupplier(String name, String address, String email, String phoneNumber, List<RawMaterial> rawMaterialList){
            Supplier supplier = new Supplier.Builder(name).supplierPhoneNumber(phoneNumber).supplierAddress(address).supplierEmail(email).rawMaterialList(rawMaterialList).build();

            return supplier;
        }

}
