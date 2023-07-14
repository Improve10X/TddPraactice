package TddFibonacci.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int num = fibonacci.findNthNumber(5);
        System.out.println(num);
    }
    public int findNthNumber(int n) {
        if (n <= 0) {
            return -1;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return findNthNumber(n - 1) + findNthNumber(n - 2);
        }
    }

}
