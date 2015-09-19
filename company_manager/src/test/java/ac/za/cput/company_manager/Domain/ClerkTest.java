package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.domain.Clerk;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/23.
 */
public class ClerkTest {

    Clerk clerk;

    @Before
    public void setUp() throws Exception {

        clerk = new Clerk.Builder(12345).employeeName("Yusra").employeeSurname("Ismail").employeeAddress("Lentegeur, Mitchells Plain").employeePhoneNumber("0768954126").employeeEmail("yusraismail17@gmail.com").employeeSalary(12000).hireDate("23-03-2010").build();


    }

    @Test
    public void testEmpName() throws Exception {

        Assert.assertEquals("Yusra", clerk.getEmployeeName());

    }

    @Test
    public void testSurname() throws Exception {


        Assert.assertEquals("Ismail", clerk.getEmployeeSurname());

    }
    @Test
    public void testAddress() throws Exception {

        Assert.assertEquals("Lentegeur, Mitchells Plain", clerk.getEmployeeAddress());

    }

    @Test
    public void testEmail() throws Exception {

        Assert.assertEquals("yusraismail17@gmail.com", clerk.getEmployeeEmail());
    }

    @Test
    public void testPhone() throws Exception {

        Assert.assertEquals("0768954126",clerk.getEmployeePhoneNumber());

    }

    @Test
    public void testSalary() throws Exception {

        Assert.assertEquals(12000, clerk.getEmployeeSalary(),2);

    }

    @Test
    public void testHireDate() throws Exception {

        Assert.assertEquals("23-03-2010", clerk.getHireDate());

    }
}
