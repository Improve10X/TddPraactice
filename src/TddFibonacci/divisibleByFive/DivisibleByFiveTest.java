package TddFibonacci.divisibleByFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFiveTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenTen_returnTen() {
        Divisible divisible = new Divisible();
        boolean result = divisible.find(10);
        assertEquals(true,result);
    }
    @Test
    public void givenMinus1_returnMinus1() {
        Divisible divisible = new Divisible();
        boolean result = divisible.find(-1);
        assertEquals(false,result);
    }
    @Test
    public void givenFifteen_returnTrue() {
        Divisible divisible = new Divisible();
        boolean result = divisible.find(15);
        assertEquals(true,result);
    }
    @Test
    public void givenFifty_returnTrue() {
        Divisible divisible = new Divisible();
        boolean result = divisible.find(50);
        assertEquals(true,result);
    }
    @Test
    public void givenSixteen_returnFalse() {
        Divisible divisible = new Divisible();
        boolean result = divisible.find(16);
        assertEquals(false,result);
    }
}
