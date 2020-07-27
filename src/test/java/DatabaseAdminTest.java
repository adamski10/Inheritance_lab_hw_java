import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Jim", 67890, 20000.00);
    }


    @Test
    public void hasName(){
        assertEquals("Jim", admin.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals(67890, admin.getNIN());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, admin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayRise(){
        admin.raiseSalary(5000.00);
        assertEquals(25000.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(200, admin.payBonus(admin.getSalary()), 0.01);
    }
}
