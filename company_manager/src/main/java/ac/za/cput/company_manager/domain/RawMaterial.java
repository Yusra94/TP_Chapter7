package ac.za.cput.companymanager.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RawMaterial implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rawMaterialId;
    private String rawMaterialName;
    private double rawMaterialCost;
    private int rawMaterialQtyOnHand;

    protected RawMaterial() {
    }

    public RawMaterial(Builder builder) {
        this.rawMaterialId = builder.rawMaterialId;
        this.rawMaterialName = builder.rawMaterialName;
        this.rawMaterialCost = builder.rawMaterialCost;
        this.rawMaterialQtyOnHand = builder.rawMaterialQtyOnHand;
    }

    public long getRawMaterialId() {
        return rawMaterialId;
    }

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public double getRawMaterialCost() {
        return rawMaterialCost;
    }

    public int getRawMaterialQtyOnHand() {
        return rawMaterialQtyOnHand;
    }

    public static class Builder {
        private long rawMaterialId;
        private String rawMaterialName;
        private double rawMaterialCost;
        private int rawMaterialQtyOnHand;

        /*public Builder(long id) {
            this.rawMaterialId = id;

        }*/

        public Builder (String name) {
            this.rawMaterialName = name;

        }

        public Builder rawMatrialCost(double cost) {
            this.rawMaterialCost = cost;
            return this;
        }

        public Builder rawMaterialQtyOnHand(int qty)
        {
            this.rawMaterialQtyOnHand = qty;
            return this;
        }

        public Builder copy(RawMaterial value)
        {
            this.rawMaterialId = value.rawMaterialId;
            this.rawMaterialName = value.rawMaterialName;
            this.rawMaterialCost = value.rawMaterialCost;
            this.rawMaterialQtyOnHand = value.rawMaterialQtyOnHand;
            return this;
        }

        public RawMaterial build()
        {
            return new RawMaterial(this);
        }
    }
}
