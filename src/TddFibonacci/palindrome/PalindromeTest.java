package TddFibonacci.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnFalse() {
        Palindrome palindrome = new Palindrome();
        boolean name = palindrome.isNumberPalindrome(null);
        assertEquals(false, name);
    }


    @Test
    public void givenNull_returnTrue() {
        Palindrome palindrome = new Palindrome();
        boolean name = palindrome.isNumberPalindrome("");
        assertEquals(true,name);
    }

}
