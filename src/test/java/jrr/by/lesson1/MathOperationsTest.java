package jrr.by.lesson1;

import org.apache.log4j.Logger;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathOperationsTest {

    Logger logger = Logger.getLogger(MathOperations.class);

    @Test
    public void testSumming() {
        int a = 5;
        int b = 8;
        int result = MathOperations.summing(a, b);
        assertEquals(13, result);
        logger.info("a + b = " + MathOperations.summing(a, b));
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 6;
        int result = MathOperations.subtraction(a, b);
        assertEquals(-1, result);
        logger.info("a - b = " + MathOperations.subtraction(a, b));
    }

    @Test
    public void testMultiplication() {
        int a = 3;
        int b = 12;
        int result = MathOperations.multiplication(a, b);
        assertEquals(36, result);
        logger.info("a * b = " + MathOperations.multiplication(a, b));
    }

    @Test
    public void testDivision() {
        int a = 18;
        int b = 6;
        int result = MathOperations.division(a, b);
        assertEquals(3, result);
        logger.info("a / b = " + MathOperations.division(a, b));
    }

    @Test
    public void testRemainderOfTheDivision() {
        int a = 18;
        int b = 12;
        int result = MathOperations.remainderOfTheDivision(a, b);
        assertEquals(6, result);
        logger.info("a % b = " + MathOperations.remainderOfTheDivision(a, b));
    }

    @Test
    public void erroneousSumming() {
        int a = 5;
        int b = 8;
        int result = MathOperations.summing(a, b);
        assertEquals(12, result);
    }

    @Test
    public void erroneousSubtraction() {
        int a = 5;
        int b = 5;
        int result = MathOperations.subtraction(a, b);
        assertEquals(1, result);
    }

    @Test
    public void erroneousMultiplication() {
        int a = 3;
        int b = 12;
        int result = MathOperations.multiplication(a, b);
        assertEquals(4, result);
    }

    @Test
    public void erroneousDivision() {
        int a = 18;
        int b = 6;
        int result = MathOperations.division(a, b);
        assertEquals(2, result);
    }

    @Test
    public void erroneousRemainderOfTheDivision() {
        int a = 18;
        int b = 12;
        int result = MathOperations.remainderOfTheDivision(a, b);
        assertEquals(1, result);
    }

}