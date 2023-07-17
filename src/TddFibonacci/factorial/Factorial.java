package TddFibonacci.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(find(0));
    }
    public static int find(int number) {
        int fact = 1;
        for (int i = 1; i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
}
