package ac.za.cput.companymanager.Domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        SupplierTest.class,
        RawMaterialTest.class,
        ProductTest.class,
        OrdersTest.class,
        CustomerTest.class,
        ShipmentTest.class,
        ContainerTest.class,
        ClerkTest.class,
        FactoryWorkerTest.class,
        ManagerTest.class
})
public class TestSuite {
}

