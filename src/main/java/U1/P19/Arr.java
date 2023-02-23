package U1.P19;

public class Arr {

    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        for (int a : arr) {
            System.out.println(a);
        }

        String[] arrStr = new String[20];

        for (String a : arrStr) {

        }

    }

}
