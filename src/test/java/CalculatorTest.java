import org.jothmart.testing.Calculator;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    static Calculator calc =  null;

    @BeforeAll
    public static void startMethod(){
        calc =  new Calculator();
    }

    @AfterAll
    public static void closingMethod(){
        calc =  null;
    }

    @Test
/*    @DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(ints = {1, 2})*/
    public void testAdd(){
        Integer actualResult = calc.add(20,30);
        Integer expectedResult = 50;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    @Disabled
    public void testMultiply(){
        Integer actualResult = calc.multiply(4,3);
        Integer expectedResult = 12;
        assertEquals(expectedResult,actualResult);
    }

}
