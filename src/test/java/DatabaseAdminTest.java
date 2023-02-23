import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alan Smith", 19, 30000.00);
    }

    @Test
    public void databaseAdmin_has_name(){
        assertEquals("Alan Smith", databaseAdmin.getName());
    }
    @Test
    public void databaseAdmin_has_niNumber(){
        assertEquals(19, (int)databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdmin_has_salary(){
        assertEquals(30000.00, (double)databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void can_raise_salary_of_developer(){
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(35000.00, (double)databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void databaseAdmin_can_get_bonus(){
        databaseAdmin.payBonus();
        assertEquals(30300.00, (double)databaseAdmin.getSalary(), 0.0);
    }
}
