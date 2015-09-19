package ac.za.cput.companymanager;

import ac.za.cput.companymanager.Domain.CustomerTest;
import ac.za.cput.companymanager.Repository.OrdersCrudTest;
import ac.za.cput.companymanager.Repository.ProductCrudTest;
import ac.za.cput.companymanager.Repository.RawMaterialCrudTest;
import ac.za.cput.companymanager.Repository.SupplierCrudTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Unit test for simple App.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({

        CustomerTest.class,
        OrdersCrudTest.class,
        ProductCrudTest.class,
        RawMaterialCrudTest.class,
        SupplierCrudTest.class
})

public class AppTest
{

}
