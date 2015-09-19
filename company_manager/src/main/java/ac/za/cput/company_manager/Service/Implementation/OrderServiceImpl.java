package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.OrderService;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getCustomer()
    {
        List<Customer> customerList = new ArrayList<>();
        Iterable<Customer> customerIterable = repository.findAll();

        for(Customer customer: customerIterable)
        {
            customerList.add(customer);
        }

        return customerList;
    }

    @Override
    public List<Orders> getCustomerOrdersById(Long id) {
        return repository.findOne(id).getOrderses();
    }

    /*@Override
    public List<Orders> getOrders(Long id)
    {
        List<Orders> ordersList = new ArrayList();
        return ordersList;
        //return  repository.findOne(id).getOrderses();

    }*/


}
