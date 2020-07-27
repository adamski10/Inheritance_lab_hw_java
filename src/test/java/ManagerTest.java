import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mike", 12345, 30000.00, "operations");
    }

    @Test
    public void hasName(){
        assertEquals("Mike", manager.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals(12345, manager.getNIN());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("operations", manager.getDeptName());
    }

    @Test
    public void canGetPayRise(){
        manager.raiseSalary(2000.00);
        assertEquals(32000.00, manager.getSalary() ,0.01);
    }

    @Test
    public  void canGetBonus(){
        assertEquals(300, manager.payBonus(manager.getSalary()), 0.01);
    }

}
