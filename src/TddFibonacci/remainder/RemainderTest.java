package TddFibonacci.remainder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemainderTest {
    @Test
    public void noting(){

    }
    @Test
    public void givenFive_returnZero(){
        Reminder reminder = new Reminder();
        int value = reminder.findDivisible(10,5);
        assertEquals(0,value);
    }
}
