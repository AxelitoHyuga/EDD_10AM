package U1.P20;

import java.util.Arrays;

public class OrderedPair {

    public static void main(String[] args) {
        printAllPossibleOrderedPairs(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void printAllPossibleOrderedPairs(int[] arrayOfItems) {
        for (int first : arrayOfItems) {
            for (int sec : arrayOfItems) {
                int[] orderedPair = new int[]{first, sec};
                System.out.println(Arrays.toString(orderedPair));
            }
        }
    }

}
