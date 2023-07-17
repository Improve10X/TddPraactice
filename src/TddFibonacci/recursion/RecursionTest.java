package TddFibonacci.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenOne_returnOne(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(1);
        assertEquals(1,value);
    }
    @Test
    public void givenTwo_returnThree(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(2);
        assertEquals(3,value);
    }
    @Test
    public void givenThree_returnSix(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(3);
        assertEquals(6,value);
    }
    @Test
    public void givenFour_return10(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(4);
        assertEquals(10,value);
    }
    @Test
    public void givenFive_returnFifteen(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(5);
        assertEquals(15,value);
    }
}
