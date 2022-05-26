import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test(expected = ArithmeticException.class)
    public void testDivideByNonZero() {
        calculator.divide(71.01, 0);
    }

    @Test(timeout = 9000)
    public void testTime() {
        calculator.subtraction(16.415, -2918);
    }


    @Test
    public void testAdd() {
        double testAddResult = calculator.add(15.5, 1.8);

        double expectedAddResult = 17.3;

        Assert.assertEquals(testAddResult, expectedAddResult, 1e-5);
    }

    @Test
    public void testMultiply() {
        double testMultiplyResult = calculator.multiply(2.5, 5.8);

        double expectedMultiplyResult = 14.5;

        Assert.assertEquals(testMultiplyResult, expectedMultiplyResult, 1e-5);
    }
}