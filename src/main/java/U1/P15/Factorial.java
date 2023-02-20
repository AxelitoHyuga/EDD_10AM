package U1.P15;

public class Factorial {

    public static void main(String[] args) {
//        int facto = 5;
//        for (int i = 5; i > 1; i--) {
//            facto = facto * (i - 1);
//        }
//        System.out.println(facto);
        int num = fact(20);
        System.out.println(num);
    }

    public static int fact(int num) {
        if (num > 0) {
            return num * fact(num - 1);
        } else {
            return 1;
        }
    }

}
