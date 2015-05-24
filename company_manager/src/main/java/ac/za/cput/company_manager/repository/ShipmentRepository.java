package ac.za.cput.company_manager.repository;

import ac.za.cput.company_manager.domain.Shipment;
import org.springframework.data.repository.CrudRepository;

public interface ShipmentRepository extends CrudRepository<Shipment,Long> {
}
