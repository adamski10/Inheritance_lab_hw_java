import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Frank", 65432, 100000.00, "operations", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Frank", director.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals(65432, director.getNIN());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("operations", director.getDeptName());
    }

    @Test
    public void canGetPayRise(){
        director.raiseSalary(2000.00);
        assertEquals(102000.00, director.getSalary() ,0.01);
    }

    @Test
    public  void canGetBonus(){
        assertEquals(1000, director.payBonus(director.getSalary()), 0.01);
    }

}
