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
//        System.out.println(list.toString());
//        System.out.println(list.getSize());

        try {
            list.addAt(5000, 2);
            System.out.println(list.toString());
            System.out.println(list.getSize());
            list.deleteAt(2);
            System.out.println(list.toString());
            System.out.println(list.getSize());

            System.out.println(String.format("La posición de %s es: %s", 5000, list.findValuePos(5000)));
            System.out.println(list.toString2());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
