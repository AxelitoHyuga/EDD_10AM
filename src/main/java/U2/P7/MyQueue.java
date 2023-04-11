package U2.P7;

import U2.P5.Node;

public class MyQueue {
    private Node front;
    private Node back;
    private int size;

    public MyQueue() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un nodo al final de la lista
    // BIG-OH: O(1)
    // Por default se agrega al final
    public void add(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            // Conectamos el nuevo nodo al final
            back.setNext(newNode);
            newNode.setPrev(back);
            back = newNode;
        }

        size++;
    }

    // Devuelve los valores de la lista formateados
    // O(N)
    public String toString() {
        String text = "[";
        Node temp = front;

        while (temp != null) {
            text += temp.getValue();
            temp = temp.getNext();

            if (temp != null) {
                text += ",";
            }
        }

        text += "]";

        return text;
    }

    // Devuelve los valores de la lista formateados
    // O(N)
    public String reverseToString() {
        String text = "[";
        Node temp = back;

        while (temp != null) {
            text += temp.getValue();
            temp = temp.getPrev();

            if (temp != null) {
                text += ",";
            }
        }

        text += "]";

        return text;
    }

    // Devuelve el tamaño de la lista
    // O(1)
    public int getSize() {
        return size;
    }
    // O(N)
//    public int getSize() {
//        Node temp = front;
//        int count = 0;
//
//        while (temp != null) {
//            count++;
//            temp = temp.getNext();
//        }
//
//        return count;
//    }

    // Devuelve si la lista esta vacia
    // O(1)
    public boolean isEmpty() {
        return front == null;
    }

    // O(1)
    public void empty() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un nodo en la posición deseada
    // O(N)
    public void addAt(int value, int pos) throws Exception {
        int nodeCount = getSize();

        // Validad posición
        if ((pos >= 0) && (pos < nodeCount)) {
            Node newNode = new Node(value);

            if (pos == 0) { // Agregar en la posición 0
                newNode.setNext(front);
                front.setPrev(newNode);
                front = newNode;
            } else { // Agregar en cualquier otra posición
                // Se recorren los nodos hasta el nodo anterior a la posición deseada
                Node temp = front;
                int nodesPos = 0;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                // Se conecta el nuevo nodo en la posición deseada
                newNode.setNext(temp);
                newNode.setPrev(temp.getPrev());
                temp.getPrev().setNext(newNode);
                temp.setPrev(newNode);
            }

            size++;
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }

    }

    // Eliminar un elemento en la posición indicada
    // O(N)
    public void deleteAt(int pos) throws Exception {
        int nodeCount = getSize();

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {

            if (nodeCount == 1) {
                empty();
            } else if (pos == 0) {
                front = front.getNext();
                front.setPrev(null);
                size--;
            } else {
                // Se recorren los nodos hasta el nodo anterior a la posición deseada
                Node temp = front;
                int nodesPos = 0;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                Node der = temp.getNext();
                Node izq = temp.getPrev();
                izq.setNext(der);

                // Ultimo nodo
                if (temp.getNext() == null) {
                    back = izq;
                } else {
                    der.setPrev(izq);
                }

                size--;
            }
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

    // Buscar un valor, si lo encuentra devuelve la posición, en su defecto devuelve -1
    // O(N)
    public int findValuePos(int val) {
        // Se recorren los nodos hasta encontrar el que coincida con el valor
        Node temp = front;
        int nodesPos = 0;
        boolean flag = false;

        while (temp != null) {
            if (temp.getValue() == val) {
                flag = true;
                break;
            }
            temp = temp.getNext();
            nodesPos++;
        }

        if (!flag)
            nodesPos = -1;

        return nodesPos;
    }

    // Busca un posición y devuelve el valor en esa posición
    // O(N)
    public int findPos(int pos) throws Exception {
//        int nodeCount = size;
          int nodeCount = getSize();

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {
            // Se recorren los nodos hasta el nodo de la posición deseada
            Node temp = front;
            int nodesPos = 0;

            while (nodesPos < pos) {
                temp = temp.getNext();
                nodesPos++;
            }

            return temp.getValue();
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

    /* Metodos necesarios para Queue */
    /* Peek devuelve el primer valor de la lista
        O(1) */
    public int peek() throws Exception {
        return findPos(0);
    }

    /* Poll devuelve el primer elemento de la lista y lo elimina
        O(1) */
    public int poll() throws Exception {
        int value = peek();
        deleteAt(0);
        return value;
    }

}