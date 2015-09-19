package ac.za.cput.company_manager.Factory;

import ac.za.cput.company_manager.domain.Shipment;

public class ShipmentFactory{

    public static Shipment createShipment(String orderDate, String driver)
    {
        Shipment shipment = new Shipment.Builder(orderDate).driver(driver).build();

        return shipment;
    }
}
