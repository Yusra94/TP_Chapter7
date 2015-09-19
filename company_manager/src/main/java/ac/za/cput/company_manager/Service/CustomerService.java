package ac.za.cput.company_manager.Service;

import ac.za.cput.company_manager.domain.Customer;
import ac.za.cput.company_manager.domain.Orders;

import java.util.List;

public interface CustomerService {

        List<Customer> getCustomer();
        List<Orders> getOrders(Long id);
}

