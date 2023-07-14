package TddFibonacci.add;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class addTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenOneAndThree_returnRemainderOne(){
        Add add = new Add();
        boolean twoAndThree = add.sumIsLessThan100(2,3);
        assertEquals(true,twoAndThree);
    }
}
