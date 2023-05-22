package U3.P3;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        int[] arregloOrig = new int[10];
        llenar(arregloOrig);
        System.out.println("ARRELGO ORIGINAL:------");
        imprimir(arregloOrig);

        System.out.println("SELECTION SORT:++++++++++++++");
        int[] arregloSel = new int[arregloOrig.length];

        selectionSort(arregloOrig);
        imprimir(arregloOrig);

        System.out.println("Valor a buscar: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        binarySearch(arregloOrig, value);
    }

    public static void llenar(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }

    public static void imprimir(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }

    /* SelecionSort
        O(n°2): Comparaciones
        O(n°2): Intercambio */
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < 10; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if(arreglo[j] < arreglo[min])
                    min = j;
            }

            if (min != i);
            int temp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
        }
    }

    // O(log^2(n))
    public static int binarySearch(int[] array, int value) {
       return binarySearchRec(array, value, 0, array.length);
    }

    private static int binarySearchRec(int[] array, int value, int ini, int fin) {
        int mid = ini + ((fin - ini) / 2);
        int res = -1;

        if (ini <= fin) {
            if (value == array[mid]) {
                res = mid;
            } else if (value > array[mid]) {
                res = binarySearchRec(array, value, ini, mid + 1);
            } else {
                res = binarySearchRec(array, value, ini - 1, fin);
            }
        }

        return res;
    }

}
