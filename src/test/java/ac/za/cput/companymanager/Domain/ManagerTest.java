package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.domain.Manager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/24.
 */
public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {

        manager = new Manager.Builder(12345).managerName("Cuan").managerSurname("Lee").build();
    }



    @Test
    public void testManagerName() throws Exception {

        Assert.assertEquals("Cuan", manager.getManagerName());
    }

    @Test
    public void testManagerSurname() throws Exception {

        Assert.assertEquals("Lee",manager.getManagerSurname());
    }

}
