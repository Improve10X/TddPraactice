package TddFibonacci.remainder;

public class Reminder {
    public static void main(String[] args) {
        Reminder reminder = new Reminder();
        int value = reminder.findDivisible(202,5);
        System.out.println(String.valueOf(value));
    }
    public int findDivisible(int a, int b) {
        int value = a%b;
    return value;
    }
}
