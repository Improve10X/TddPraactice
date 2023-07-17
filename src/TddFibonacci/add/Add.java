package TddFibonacci.add;

public class Add {
    public static void main(String[] args) {

        boolean value = sumIsLessThan100(12,1);
        System.out.println(value);
    }

    public static boolean sumIsLessThan100(int i, int i1) {
        if (i + i1<100){
           return true;
        }
        return false;
    }
}
