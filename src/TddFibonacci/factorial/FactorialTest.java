package TddFibonacci.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void nothing() {

    }
    @Test
    public void givenFive_returnOneTwenty(){
        Factorial factorial = new Factorial();
        int value = factorial.find(5);
        assertEquals(120,value);
    }
    @Test
    public void givenOne_returnOne(){
        Factorial factorial = new Factorial();
        int value = factorial.find(1);
        assertEquals(1,value);
    }
    @Test
    public void givenZero_returnOne(){
        Factorial factorial = new Factorial();
        int value = factorial.find(0);
        assertEquals(1,value);
    }
    @Test
    public void givenFour_returnTwentyFour(){
        Factorial factorial = new Factorial();
        int value = factorial.find(4);
        assertEquals(24,value);
    }
}
