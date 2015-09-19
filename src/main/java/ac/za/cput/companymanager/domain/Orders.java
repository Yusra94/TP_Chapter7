package ac.za.cput.companymanager.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderNumber;
    private String orderDate;
    private double totalSales;
   @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   @JoinColumn(name="order_products")
    private List<Product> productList;

    public Orders() {
    }

    public Orders(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.orderDate = builder.orderDate;
        this.totalSales = builder.totalSales;
       // this.finishedProductList = builder.finishedProductList;
        this.productList = builder.productList;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

   // public List<FinishedProduct> getFinishedProduct(){return finishedProductList;}

    public String getOrderDate() {
        return orderDate;
    };

    public double getTotalSales() {
        return totalSales;
    }

    public List<Product> getProductList(){return productList;}

    public static class Builder
    {
        private long orderNumber;
        private String orderDate;
        private double totalSales;
       // private List<FinishedProduct> finishedProductList;
        private List<Product> productList;



        public Builder (String orderDate)
        {
            this.orderDate = orderDate;

        }

        public Builder orderNumber(long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder totalSales(double total)
        {
            this.totalSales = total;
            return this;
        }

        public Builder productList(List<Product> value)
        {
            this.productList = value;
            return this;
        }

        public Builder copy(Orders value)
        {
            this.orderNumber = value.orderNumber;
           // this.finishedProductList = value.finishedProductList;
            this.orderDate = value.orderDate;
            this.totalSales = value.totalSales;
            this.productList = value.productList;
            return this;
        }

        public Orders build()
        {
            return new Orders(this);
        }
    }
}


