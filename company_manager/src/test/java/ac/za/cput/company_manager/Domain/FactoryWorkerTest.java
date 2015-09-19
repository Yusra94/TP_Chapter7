package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.domain.FactoryWorker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/24.
 */
public class FactoryWorkerTest {

    FactoryWorker factoryWorker;

    @Before
    public void setUp() throws Exception {

        factoryWorker = new FactoryWorker.Builder(12345).employeeName("Gammatjie").employeeSurname("Abdul").employeeSalary(8000.00).employeeHireDate("18-12-2014").build();
    }

    @Test
    public void testFactroyWorkerName() throws Exception {

        Assert.assertEquals("Gammatjie", factoryWorker.getEmployeeName());
    }

    @Test
    public void testFactoryWorkerSurname() throws Exception {

        Assert.assertEquals("Abdul",factoryWorker.getEmployeeSurname());
    }

    @Test
    public void testEmployeeSalary() throws Exception {

        Assert.assertEquals(8000.00, factoryWorker.getSalary(),2);
    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals("18-12-2014", factoryWorker.getHireDate());
    }
}
