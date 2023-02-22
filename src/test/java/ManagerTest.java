import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Pearl Robbins", 16, 80750.00, "Dept of Tomfoolery");
    }

    @Test
    public void manager_has_name(){
        assertEquals("Pearl Robbins", manager.getName());
    }

    @Test
    public void manager_has_niNumber(){
        assertEquals(16, (int)manager.getNiNumber());
    }

    @Test
    public void manager_has_salary(){
        assertEquals(80750.00, (double)manager.getSalary(), 0.0);
    }

    @Test
    public void manager_has_department(){
        assertEquals("Dept of Tomfoolery", manager.getDeptName());
    }

    @Test
    public void can_raise_salary(){
        manager.raiseSalary(5000.00);
        assertEquals(85750.00, (double)manager.getSalary(), 0.0);
    }

    @Test
    public void can_get_bonus(){
        manager.payBonus();
        assertEquals(81557.50, (double)manager.getSalary(), 0.0);
    }

}
