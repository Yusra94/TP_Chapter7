package ac.za.cput.company_manager.Service.Implementation;

import ac.za.cput.company_manager.Service.CustomerService;
import ac.za.cput.company_manager.domain.Customer;
import ac.za.cput.company_manager.domain.Orders;
import ac.za.cput.company_manager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getCustomer()
    {
        List<Customer> customerList = new ArrayList();
        Iterable<Customer> customerIterable = repository.findAll();
        for (Customer customer : customerIterable) {
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public List<Orders> getOrders(Long id)
    {
        return repository.findOne(id).getOrderses();
    }

}
