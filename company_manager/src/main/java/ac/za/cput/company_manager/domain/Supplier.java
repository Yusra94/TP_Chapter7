package ac.za.cput.companymanager.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Supplier implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long supplierId;
    private String supplierName;
    private String supplierPhoneNumber;
    private String supplierEmail;
    private String supplierAddress;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="supplier_material")
    private List<RawMaterial> rawMaterialList;

    public Supplier() {
    }

    public Supplier(Builder builder) {
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
        this.supplierPhoneNumber = builder.supplierPhoneNumber;
        this.supplierEmail = builder.supplierEmail;
        this.supplierAddress = builder.supplierAddress;
        this.rawMaterialList = builder.rawMaterialList;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public List<RawMaterial> getRawMaterialList(){return rawMaterialList;}

    public static class Builder
    {
        private long supplierId;
        private String supplierName;
        private String supplierPhoneNumber;
        private String supplierEmail;
        private String supplierAddress;
        private List<RawMaterial> rawMaterialList;

        public Builder(String name)
        {
            this.supplierName = name;

        }
        public Builder supplierId(long id)
        {
            this.supplierId = id;
            return this;
        }

        public Builder supplierPhoneNumber(String phone)
        {
            this.supplierPhoneNumber = phone;
            return this;
        }

        public Builder supplierEmail(String email)
        {
            this.supplierEmail = email;
            return this;
        }

        public Builder supplierAddress(String address)
        {
            this.supplierAddress = address;
            return this;
        }

        public Builder rawMaterialList(List<RawMaterial> value)
        {
            this.rawMaterialList = value;
            return this;
        }

        public Builder copy(Supplier value)
        {
            this.supplierId = value.supplierId;
            this.supplierName = value.supplierName;
            this.supplierAddress = value.supplierAddress;
            this.supplierEmail = value.supplierEmail;
            this.supplierPhoneNumber = value.supplierPhoneNumber;
            this.rawMaterialList = value.rawMaterialList;
            return  this;
        }

        public Supplier build()
        {
            return new Supplier(this);
        }
    }
}
