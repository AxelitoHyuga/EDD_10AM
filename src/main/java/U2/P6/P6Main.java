package U2.P6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P6Main {

    public static void main(String[] args) {
        Queue queue = new LinkedList<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Stack stack = new Stack();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}
