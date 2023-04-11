package U2.P8;

public class P8Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);

        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);
        System.out.println("Poll: " + stack.pop());
        System.out.println(stack);
    }

}
