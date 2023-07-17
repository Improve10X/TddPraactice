package TddFibonacci.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        String fizzBuzz = find(-1);
        System.out.println(fizzBuzz);
    }
    public static String find(int n) {
        if (n>0){
            if (n%3==0 && n%5==0){
                return "FizzBuzz";
            } else if (n%3==0) {
                return "Fizz";
            } else if (n%5==0) {
                return "buzz";
            }
        }
        return String.valueOf(n);
    }
}
