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
    @Test
    public void developer_has_niNumber(){
        assertEquals(18, (int)developer.getNiNumber());
    }

    @Test
    public void developer_has_salary(){
        assertEquals(35000.00, (double)developer.getSalary(), 0.0);
    }

    @Test
    public void can_raise_salary_of_developer(){
        developer.raiseSalary(5000.00);
        assertEquals(40000.00, (double)developer.getSalary(), 0.0);
    }

    @Test
    public void developer_can_get_bonus(){
        developer.payBonus();
        assertEquals(35350.00, (double)developer.getSalary(), 0.0);
    }
}
