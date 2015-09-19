package ac.za.cput.company_manager.Factory;

import ac.za.cput.company_manager.domain.Orders;
import ac.za.cput.company_manager.domain.Product;

import java.util.List;

public class OrderFactory {

    public static Orders createOrder(String orderDate, double totalSales, List<Product> productList)
    {
        Orders orders = new Orders.Builder(orderDate).totalSales(totalSales).productList(productList).build();

        return orders;
    }
}
