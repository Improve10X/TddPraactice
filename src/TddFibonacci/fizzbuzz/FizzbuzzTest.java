package TddFibonacci.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    public void nothing() {

    }
    @Test
    public void givenZero_returnZero(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.find(0);
        assertEquals("0",zero);
    }
    @Test
    public void givenMinus1_returnMinus1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.find(-1);
        assertEquals("-1",zero);
    }
    @Test
    public void givenThree_returnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.find(3);
        assertEquals("Fizz",zero);
    }
    @Test
    public void givenFive_returnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.find(5);
        assertEquals("buzz",zero);
    }
    @Test
    public void givenFifteen_returnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.find(5);
        assertEquals("Fizzbuzz",zero);
    }
}
