import org.junit.*;

import static org.junit.Assert.assertEquals;



public class CalculatorTest {


    Application Calculate = new Application();

    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, Calculate.sum(7,8));
    }

    public void testGetMinus() throws Exception {
        assertEquals(2, Calculate.minus(5,3));
    }

    public void testGetMultiply() throws Exception {
        assertEquals(10, Calculate.multiply(5,2));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(5, Calculate.divide(25,5));
    }



}

