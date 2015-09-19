package ac.za.cput.company_manager.repository;

import ac.za.cput.company_manager.domain.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
