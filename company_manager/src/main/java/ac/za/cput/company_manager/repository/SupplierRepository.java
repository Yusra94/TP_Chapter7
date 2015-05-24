package ac.za.cput.company_manager.repository;

import ac.za.cput.company_manager.domain.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository  extends CrudRepository<Supplier, Long> {

   // public Supplier findCode(Integer code);
}

