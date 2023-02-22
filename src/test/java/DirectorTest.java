import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("The Big Woman", 25, 50000.00, "Dept of Tomfoolery", 1_000_000.00);
    }

    @Test
    public void director_has_niNumber(){
        assertEquals(25, (double)director.getNiNumber(), 0.0);
    }

    @Test
    public void director_has_budget(){
        assertEquals(1_000_000.00, (double)director.getBudget(), 0.0);
    }
}
