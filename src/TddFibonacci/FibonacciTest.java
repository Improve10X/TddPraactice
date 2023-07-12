package TddFibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void empty() {

    }

    @Test
    public void givenAnyNegativeNumberInteger_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-5);
        assertEquals(-1, negativeFibonacci);
    }
    @Test
    public void givenZero_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(0);
        assertEquals(-1, negativeFibonacci);
    }
    @Test
    public void givenOne_returnsNegativeZero() {
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findNthNumber(1);
        assertEquals(0,firstFibonacci);
    }
    @Test
    public void givenTwo_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findNthNumber(2);
        assertEquals(1,secondFibonacci);
    }

    @Test
    public void givenThree_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.findNthNumber(3);
        assertEquals(1,thirdFibonacci);
    }

    @Test
    public void givenFive_returnsNegativethree() {
        Fibonacci fibonacci = new Fibonacci();
        int fifthFibonacci = fibonacci.findNthNumber(5);
        assertEquals(3,fifthFibonacci);
    }
}
