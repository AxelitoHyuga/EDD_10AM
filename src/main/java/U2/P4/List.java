package U2.P4;

public class List {
    private Node front;
    private Node back;

    // Al crear la lista front debe ser igual (La lista esta vacia)
    public List() {
        front = null;
        back = null;
    }

    // Agregar un nodo al final de la lista
    // BIG-OH: O(N) -> Cuando se hacia con ciclo
    // BIG-OH: O(1) -> Agregando Back
    // Por default se agrega al final
    public void add(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
//            Node temp = front;

            // O(N):
//            while (temp.getNext() != null) {
//                temp = temp.getNext();
//            }

            back.setNext(newNode);
            back = newNode;
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

    // Devuelve el tamaño de la lista
    public int getSize() {
        Node temp = front;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    // Devuelve si la lista esta vacia
    public boolean isEmpty() {
        return front == null;
    }

    public void empty() {
        front = null;
        back = null;
    }

    // Agregar un nodo en la posición deseada
    public void addAt(int value, int pos) throws Exception {
        int nodeCount = getSize();

        // Validad posición
        if ((pos >= 0) && (pos < nodeCount)) {
            Node newNode = new Node(value);

            if (pos == 0) { // Agregar en la posición 0
                newNode.setNext(front);
                front = newNode;
            } else { // Agregar en cualquier otra posición
                Node temp = front;
                int nodesPos = 1;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }

        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }

    }

    public void deleteAt(int pos) throws Exception {
        int nodeCount = getSize();

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {

            if (nodeCount == 1) {
                empty();
            } else if (pos == 0) {
                front = front.getNext();
            } else {
                Node temp = front;
                int nodesPos = 1;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                temp.setNext(temp.getNext().getNext());

                if (temp.getNext() == null) {
                    back = temp;
                }
            }

        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

}
