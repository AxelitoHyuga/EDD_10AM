package U3.P2;

import java.util.Comparator;
import java.util.LinkedList;

public class Comparators {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(500);
        list.add(200);
        list.add(800);
        list.add(300);

        System.out.println(list.toString());
        list.sort(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        /* Si regresamos:
                            Valor positivo: o1 > o2,
                            Cero:           o1 = 02,
                            Valor negativo: 01 < 02
                        */

                        return o1 - o2;
                    }
                }
        );
        System.out.println(list.toString());

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Juan");
        stringList.add("Adriana");
        stringList.add("Pedro");
        stringList.add("Zamudio");
        stringList.add("Basilio");

        System.out.println(stringList.toString());
//        stringList.sort(
//                new Comparator<String>() {
//                    @Override
//                    public int compare(String o1, String o2) {
//                        return o1.compareTo(o2);
//                    }
//                }
//        );

        stringList.sort(
                new Comparator<String>() {
                    private int compareString(String s1, String s2) {
                        char[] chars1 = s1.toCharArray();
                        char[] chars2 = s2.toCharArray();

                        return 0;
                    }

                    @Override
                    public int compare(String o1, String o2) {
                        return compareString(o1, o2);
                    }
                }
        );
    }

}
