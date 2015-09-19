package ac.za.cput.companymanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderNumber;
    private String date;
    private String driver;

    public Shipment() {
    }

    public Shipment(Builder builder)
    {
        this.orderNumber = builder.orderNum;
        this.date = builder.orderDate;
        this.driver = builder.driverName;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public String getDate() {
        return date;
    }

    public String getDriver() {
        return driver;
    }

    public static class Builder
    {
        private long orderNum;
        private String orderDate;
        private String driverName;

        public Builder(String date) {

            this.orderDate = date;
        }

        public Builder orderNumber(long number)
        {
            this.orderNum = number;
            return this;
        }

        public Builder driver(String driverName)
        {
            this.driverName = driverName;
            return this;
        }

        public Builder copy(Shipment value)
        {
            this.orderNum = value.orderNumber;
            this.driverName = value.driver;
            this.orderDate = value.date;
            return this;
        }

        public Shipment build()
        {
            return new Shipment(this);
        }
    }
}
