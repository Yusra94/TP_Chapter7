package ac.za.cput.company_manager.Service;

import ac.za.cput.company_manager.domain.Customer;
import ac.za.cput.company_manager.domain.Orders;

import java.util.List;

public interface OrderService {

    public List<Customer> getCustomer();
    public List<Orders> getCustomerOrdersById(Long id);
}
