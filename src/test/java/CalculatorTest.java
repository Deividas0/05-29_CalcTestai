import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void increment() {
        //Setup
        int a = 5;
        //Execute
        calc.increment(a);
        //Asserting
        assertEquals(6,calc.increment(a));
    }
    @Test
    void increment2() {
        //Setup
        // ---
        //Execute
        calc.increment(5);
        //Asserting
        assertEquals(6,calc.increment(5));
    }

    @Test
    void sum() {
        //Setup
        int a = 1;
        int b = 2;
        //Execute
        calc.Sum(a,b);
        //Asserting
        assertEquals(3,calc.Sum(a,b));
    }
    @Test
    void sum2() {
        //Setup
        // ---
        //Execute
        calc.Sum(1,2);
        //Asserting
        assertEquals(3,calc.Sum(1,2));
    }

    @Test
    void subtract() {
        //Setup
        int a = 5;
        int b = 2;
        //Execute
        calc.Subtract(a,b);
        //Asserting
        assertEquals(3,calc.Subtract(a,b));
    }
    @Test
    void subtract2() {
        //Setup
        // ---
        //Execute
        calc.Subtract(5,2);
        //Asserting
        assertEquals(3,calc.Subtract(5,2));
    }

    @Test
    void mutliply() {
        //Setup
        int a = 3;
        int b = 2;
        //Execute
        calc.Multiply(a,b);
        //Asserting
        assertEquals(6,calc.Multiply(a,b));
    }
    @Test
    void mutliply2() {
        //Setup
        // ---
        //Execute
        calc.Multiply(3,2);
        //Asserting
        assertEquals(6,calc.Multiply(3,2));
    }

    @Test
    void divide() {
        //Setup
        int a = 10;
        int b = 5;
        //Execute
        calc.divide(a,b);
        //Asserting
        assertEquals(2, calc.divide(a,b));
    }
    @Test
    void divide2() {
        //Setup
        // ---
        //Execute
        calc.divide(10,5);
        //Asserting
        assertEquals(2, calc.divide(10,5));
    }
}