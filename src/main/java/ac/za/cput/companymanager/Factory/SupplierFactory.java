package ac.za.cput.companymanager.Factory;

import ac.za.cput.companymanager.domain.RawMaterial;
import ac.za.cput.companymanager.domain.Supplier;

import java.util.List;

public class SupplierFactory {

        public static Supplier createSupplier(String name, String address, String email, String phoneNumber, List<RawMaterial> rawMaterialList){
            Supplier supplier = new Supplier.Builder(name).supplierPhoneNumber(phoneNumber).supplierAddress(address).supplierEmail(email).rawMaterialList(rawMaterialList).build();

            return supplier;
        }

}
