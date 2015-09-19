package ac.za.cput.companymanager.Service;

import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;

import java.util.List;

public interface OrderService {

    public List<Customer> getCustomer();
    public List<Orders> getCustomerOrdersById(Long id);
}
