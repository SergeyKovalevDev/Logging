import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcImplTest extends CalcImpl {
    private CalcImpl calc;

    @Before
    public void setUp() throws Exception {
        calc = new CalcImpl();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void testGetAdd() {
        assertEquals(45, calc.getAdd(40, 5));
    }

    @Test
    public void testGetSub() {
        assertEquals(20, calc.getSub(60, 40));
    }

    @Test
    public void testGetMul() {
        assertEquals(99, calc.getMul(33,3));
    }

    @Test
    public void testGetDiv() {
        assertEquals(25, getDiv(100,4));
    }

    @Test(expected = ArithmeticException.class)
    public void testGetDivWithException() {
        calc.getDiv(24, 0);
    }
}