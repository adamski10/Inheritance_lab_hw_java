import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Gizmo", 54321, 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Gizmo", developer.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals(54321, developer.getNIN());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayRise(){
        developer.raiseSalary(5000.00);
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, developer.payBonus(developer.getSalary()), 0.01);
    }
}
