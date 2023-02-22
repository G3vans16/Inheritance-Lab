import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave Jones", 18, 35000.00);
    }

    @Test
    public void developer_has_name(){
        assertEquals("Dave Jones", developer.getName());
    }
}
