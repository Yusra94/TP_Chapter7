package ac.za.cput.company_manager.repository;

import ac.za.cput.company_manager.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
