package ac.za.cput.companymanager.Domain;

import ac.za.cput.companymanager.domain.Container;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/24.
 */
public class ContainerTest {

    Container container;

    @Before
    public void setUp() throws Exception {

        container = new Container.Builder(5).build();

    }

    @Test
    public void testContainerSize() throws Exception {

        Assert.assertEquals(5, container.getContainerSize());

    }
}
