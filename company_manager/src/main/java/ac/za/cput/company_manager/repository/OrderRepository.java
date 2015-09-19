package ac.za.cput.company_manager.repository;

import ac.za.cput.company_manager.domain.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long> {

    //public Orders findByCode(Integer code);

}
