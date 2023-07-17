package TddFibonacci.palindrome;

public class Palindrome {

    public boolean isNumberPalindrome(String word) {
        String reverse = "";
        String trimWord = word.trim();
        for(int i = trimWord.length() - 1; i >=0; i--){
            reverse += trimWord.charAt(i);
        }
        if (trimWord.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }
}
