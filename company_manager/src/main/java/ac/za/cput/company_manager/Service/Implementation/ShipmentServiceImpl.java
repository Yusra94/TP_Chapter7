package ac.za.cput.company_manager.Service.Implementation;

import ac.za.cput.company_manager.Service.ShipmentService;
import ac.za.cput.company_manager.domain.Shipment;
import ac.za.cput.company_manager.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    ShipmentRepository repository;

    @Override
    public List<Shipment> getShipment()
    {
        List<Shipment> shipmentList = new ArrayList();

        Iterable<Shipment>  shipmentIterable = repository.findAll();

        for (Shipment shipment  : shipmentIterable) {
            shipmentList.add(shipment);
        }

        return shipmentList;

    }
}
