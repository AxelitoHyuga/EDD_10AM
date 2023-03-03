package U2.P1;

public class Cambiar_Tam_Arreglo<T> {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        // / Expandir el arreglo a tamaño 10 sin perder datos
        // Con el metodo copyOf de la clase Arrays
//        int[] arrCopy = Arrays.copyOf(arr, 10);
//
//        for(int el : arrCopy) {
//            System.out.println("[" + el + "]");
//        }

        // Sin ninguna utileria
        int[] arrCopy = copyOf(arr, 10);

        for (int el : arrCopy) {
            System.out.println("[" + el + "]");
        }
    }

    public static int[] copyOf(int[] array, int size) {
        int[] newArray = new int[size];
        int index = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }
}
