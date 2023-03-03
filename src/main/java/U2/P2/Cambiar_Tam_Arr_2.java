package U2.P2;

public class Cambiar_Tam_Arr_2 {

    public static void main(String[] args) {
        int[] arr = new int[1];

        // Cada ciclo simula un cliente nuevo y se amuenta el tamaño en 1 del arreglo
        for (int i = 1; i < 1_000_000; i++) {
            int[] arrCopy = copyOf(arr, i);
            arrCopy[i-1] = (int)(Math.random() * 100);
            arr = arrCopy;
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
