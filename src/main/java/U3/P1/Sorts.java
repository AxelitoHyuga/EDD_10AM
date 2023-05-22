package U3.P1;
public class Sorts {

    public static void main(String[] args) {

        int[] arregloOrig = new int[] {1,9,40,91,99,12,29,47,52,70};
        /*llenar(arregloOrig);

        System.out.println("Arreglo original:----------------------------------------");
        long ini = System.nanoTime();
        imprimir(arregloOrig);
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println("Tiempo de llenado: " + tiempo);

        System.out.println("Selection sort:+++++++++++++++++++++++++++++++++++++++++++");
        int[] arregloSel = new int[arregloOrig.length];
        copiar(arregloOrig, arregloSel);
        imprimir(arregloSel);
        ini = System.nanoTime();
        selectionSort(arregloSel);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloSel);
        System.out.println("Tiempo de seelction sort: " + tiempo);
/*
        System.out.println("Insection sort:+++++++++++++++++++++++++++++++++++++++++++");
        int[] arregloIns = new int[arregloOrig.length];
        copiar(arregloOrig, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        insertionSort(arregloIns);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloIns);
        System.out.println("Tiempo de insection sort: " + tiempo);

        System.out.println("Bubble sort:+++++++++++++++++++++++++++++++++++++++++++");
        int[] arregloBubble = new int[arregloOrig.length];
        copiar(arregloOrig, arregloBubble);
        imprimir(arregloBubble);
        ini = System.nanoTime();
        bubbleSort(arregloBubble);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloBubble);
        System.out.println("Tiempo de bubble sort: " + tiempo);

        System.out.println("Quick sort:+++++++++++++++++++++++++++++++++++++++++++");
        int[] arregloQuick = new int[arregloOrig.length];
        copiar(arregloOrig, arregloQuick);
        imprimir(arregloQuick);
        ini = System.nanoTime();
        quickSort(arregloQuick);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloQuick);
        System.out.println("Tiempo de quick sort: " + tiempo);*/

        int[] arregloQuick = new int[arregloOrig.length];
        copiar(arregloOrig, arregloQuick);
        quickSort(arregloQuick);
        imprimir(arregloQuick);
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

    public static void copiar(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }

    /* SelecionSort
        O(n^2): Comparaciones
        O(n^2): Intercambio */
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;

            for (int j = (i + 1); j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            /* Se intercambia min - i */
            if (min != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }

        }
    }

    /* InsertionSort
        O(n): comparaciones
        O(n*2): intercambios */
    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            int insP = i;

            for (int prev = i - 1; prev >= 0; prev--) {
                /* Si el elemento anterior es mayor al actual, intercambiamos */
                if (arreglo[prev] > temp) {
                    arreglo[insP] = arreglo[prev];
                    insP--;
                } else {
                    break;
                }
            }

            arreglo[insP] = temp;
        }
    }

    /* BubbleSort */
    public static void bubbleSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < (arreglo.length - i - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    /* QuickSort N*N */
    public static void quickSort(int[] arr) {
        quickSortRec(arr, 0, arr.length - 1);
    }

    private static void quickSortRec(int[] arr, int ini, int fin) {
        if (ini < fin) {
            int pivot = quickSortPart(arr, ini, fin);

            /* Sortea los elementos recursivamente antes y después de la partición */
            quickSortRec(arr, ini, pivot - 1);
            quickSortRec(arr, pivot + 1, fin);
        }
    }

    private static int quickSortPart(int arr[], int ini, int fin) {
        int pivot = arr[fin];
        int i = (ini-1);
        for (int j=ini; j<fin; j++)
        {
            /* Si el elemento actual es menor o igual al pivote */
            if (arr[j] <= pivot)
            {
                i++;

                /* Se intercambian arr[i] y arr[j] */
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Se intercambian arr[i+1] y arr[fin] (o pivote)
        int temp = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = temp;

        return i+1;
    }

}
