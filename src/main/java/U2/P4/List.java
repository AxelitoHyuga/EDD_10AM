package U2.P4;

public class List {
    private Node front;

    // Al crear la lista front debe ser igual (La lista esta vacia)
    public List() {
        front = null;
    }

    // Agregar un nodo al final de la lista
    public void add(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
        } else {
            Node temp = front;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(newNode);
        }
    }

    // Devuelve los valores de la lista formateados
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

    public int getSize() {
        Node temp = front;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }
}
