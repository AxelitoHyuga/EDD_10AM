package U2.P7;

public class P7Main {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);

        try {
            System.out.println(queue);
            System.out.println("Peek: " + queue.peek());
            System.out.println(queue);
            System.out.println("Poll: " + queue.poll());
            System.out.println(queue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
