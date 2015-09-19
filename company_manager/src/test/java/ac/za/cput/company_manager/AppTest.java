package ac.za.cput.company_manager;

import ac.za.cput.company_manager.Domain.CustomerTest;
import ac.za.cput.company_manager.Repository.OrdersCrudTest;
import ac.za.cput.company_manager.Repository.ProductCrudTest;
import ac.za.cput.company_manager.Repository.RawMaterialCrudTest;
import ac.za.cput.company_manager.Repository.SupplierCrudTest;
import ac.za.cput.company_manager.domain.Supplier;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
