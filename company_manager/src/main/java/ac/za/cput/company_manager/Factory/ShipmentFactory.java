package ac.za.cput.companymanager.Factory;

import ac.za.cput.companymanager.domain.Shipment;

public class ShipmentFactory{

    public static Shipment createShipment(String orderDate, String driver)
    {
        Shipment shipment = new Shipment.Builder(orderDate).driver(driver).build();

        return shipment;
    }
}
