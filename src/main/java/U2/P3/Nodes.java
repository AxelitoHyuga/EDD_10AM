package U2.P3;

public class Nodes {

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.val = 100;
        node1.sig = new Node();
        node1.sig.val = 200;
        node1.sig.sig = new Node();
        node1.sig.sig.val = 300;

//        System.out.println("[" + node1.val + "]");
//        System.out.println("[" + node1.sig.val + "]");
//        System.out.println("[" + node1.sig.sig.val + "]");

        Node temp = node1;
        while (temp != null) {
            System.out.println("[" + temp.val + "]");
            temp = temp.sig;
        }
    }

}

class Node {
    public int val;
    public Node sig;

    public Node() {
        sig = null;
    }
}