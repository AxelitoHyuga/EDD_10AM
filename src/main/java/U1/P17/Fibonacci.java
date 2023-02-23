package U1.P17;

public class Fibonacci {

    public static void main(String[] args) {
        int val = 7;
        System.out.println(String.format("fibonacciRecursivo(%s) = %s", val, fibonacciRecursivo(val)));
    }

    public static int fibonacciRecursivo(int pos) {
        if (pos == 0 || pos == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(pos - 1) + fibonacciRecursivo(pos - 2);
        }
    }

}
