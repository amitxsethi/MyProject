import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void testAddition() {
         Calculator calculator = new Calculator();
         Assertions.assertEquals(9,
                 calculator.add(4,5));
    }

}