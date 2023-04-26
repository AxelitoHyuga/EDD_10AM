package U2.P9;

public class P9Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(50);
        tree.add(30);
        tree.add(60);
        tree.add(35);
        tree.add(27);
        tree.add(68);
        tree.add(59);
        tree.add(100);

        tree.printPreOrder();
        System.out.println();
        tree.printInOrder();
        System.out.println();
        tree.printPostOrder();
    }

}
