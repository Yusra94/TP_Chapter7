package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.ShipmentService;
import ac.za.cput.companymanager.domain.Shipment;
import ac.za.cput.companymanager.repository.ShipmentRepository;
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
