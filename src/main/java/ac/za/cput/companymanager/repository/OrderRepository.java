package ac.za.cput.companymanager.repository;

import ac.za.cput.companymanager.domain.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long> {

    //public Orders findByCode(Integer code);

}
