package U2.P9;

import org.jetbrains.annotations.NotNull;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null; // Arbol vacio
    }

    public void add(int value) {
        Node newNode = new Node(value); // Se crea un nuevo objeto tipo node

        // Validar si el arbol esta vacio o no
        if (root == null) {
            root = newNode; // Si esta vacio root es igual al nuevo nodo
        } else {
            addNode(root, newNode);
        }
    }

    private void addNode(@NotNull Node currentNode, @NotNull Node newNode) {
        // Validar si nuevo valor va posicionado a la izquierda, a la derecha o es existente
        if (currentNode.getValue() > newNode.getValue()) {
            if (currentNode.getLeft() == null) { // Posicionamos el nodo nuevo a la izquierda del nodo actual si esta vacio
                currentNode.setLeft(newNode);
            } else {
                addNode(currentNode.getLeft(), newNode);
            }
        } else if (currentNode.getValue() < newNode.getValue()) { // Se posiciona a la derecha
            if (currentNode.getRight() == null) { // Posicionamos el nodo nuevo a la derecha del nodo actual si esta vacio
                currentNode.setRight(newNode);
            } else {
                addNode(currentNode.getRight(), newNode);
            }
        } else { // El valor ya existe en el arbol
            System.out.println(String.format("El valor: %s ya existe", newNode.getValue()));
        }
    }

    public void printPreOrder() {
        preOrder(root);
    }

    public void printInOrder() {
        inOrder(root);
    }

    public void printPostOrder() {
        postOrder(root);
    }

    /* Pre Order:
        Lee el valor, recorre izquierda, recorre derecha */
    private void preOrder(Node currentNode) {
        if (currentNode != null) {
            System.out.print("[ " + currentNode.getValue() + " ]");
            preOrder(currentNode.getLeft());
            preOrder(currentNode.getRight());
        }
    }

    /* In Order:
        Recorre izquierda, lee valor, recorre derecha */
    private void inOrder(Node currentNode) {
        if (currentNode != null) {
            inOrder(currentNode.getLeft());
            System.out.print("[ " + currentNode.getValue() + " ]");
            inOrder(currentNode.getRight());
        }
    }

    /* Posr Order:
       Recorre izquierda, recorre derecha, lee valor */
    private void postOrder(Node currentNode) {
        if (currentNode != null) {
            postOrder(currentNode.getLeft());
            postOrder(currentNode.getRight());
            System.out.print("[ " + currentNode.getValue() + " ]");
        }
    }

}
