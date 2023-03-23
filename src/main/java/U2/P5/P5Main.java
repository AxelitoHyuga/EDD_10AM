package U2.P5;

public class P5Main {

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }

        System.out.println(list.toString());
        System.out.println(list.getSize());

        try {
//            list.addAt(78, 4);
//            System.out.println(list.toString());
//            System.out.println(list.getSize());

//            list.deleteAt(0);
//            System.out.println(list.reverseToString());
//            System.out.println(list.getSize());

            list.deleteAt(9);
            System.out.println(list.toString());
            System.out.println(list.reverseToString());
            System.out.println(list.getSize());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
