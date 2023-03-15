package U2.P4;

public class P4Main {

    public static void main(String[] args) {
        List list = new List();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }

        System.out.println(list.toString());
        System.out.println(list.getSize());
//        list.empty();

        try {
            list.addAt(5000, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.toString());
        System.out.println(list.getSize());

        try {
            list.deleteAt(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.toString());
        System.out.println(list.getSize());
    }

}
