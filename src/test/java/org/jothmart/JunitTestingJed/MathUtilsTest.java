package org.jothmart.JunitTestingJed;

import org.jothmart.testing.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testAdd(){
        MathUtils mathUtils = new MathUtils();
        int expected =2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The add method should add 2 numbers!");
    }

    @Test
    void testComputeCircleRadius(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,  mathUtils.computeCircleRadius(10),"Should return right circle area!");
    }

}
