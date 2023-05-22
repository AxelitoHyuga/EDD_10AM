package U3.P4_Tarea;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

interface Sort {
    public void run(int arr[]);

    public String getName();
    public String getFileName();
}

class SelectionSort implements Sort {
    @Override
    public void run(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            /* Se intercambia min - i */
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
    }

    @Override
    public String getName() {
        return "Selection Sort";
    }

    @Override
    public String getFileName() {
        return "selection_sort.txt";
    }
}

class InsertionSort implements Sort {
    @Override
    public void run(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int insP = i;

            for (int prev = i - 1; prev >= 0; prev--) {
                /* Si el elemento anterior es mayor al actual, intercambiamos */
                if (arr[prev] > temp) {
                    arr[insP] = arr[prev];
                    insP--;
                } else {
                    break;
                }
            }

            arr[insP] = temp;
        }
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public String getFileName() {
        return "insertion_sort.txt";
    }
}

class BubbleSort implements Sort {
    @Override
    public void run(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }

    @Override
    public String getFileName() {
        return "bubble_sort.txt";
    }
}

class QuickSort implements Sort {
    @Override
    public void run(int[] arr) {
        quickSortRec(arr, 0, arr.length - 1);
    }

    @Override
    public String getName() {
        return "Quick Sort";
    }

    @Override
    public String getFileName() {
        return "quick_sort.txt";
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

public class Sortings {

    public static void llenar(int[] arreglo, int size){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        int[] sizes = new int[] { 10, 50, 100, 500, 1000, 5000, 10000, 100000, 1000000 };
//        int[] sizes = new int[] { 10, 50, 100, 500, 1000, 5000, 10000 };
        Sort[] methods = new Sort[] { new SelectionSort(), new InsertionSort(), new BubbleSort(), new QuickSort() };

        for (int m = 0; m < methods.length; m++) {
            String data = String.format("%s %n", methods[m].getName());
            System.out.println(String.format("Metodo %s", methods[m].getName()));

            for (int i = 0; i < sizes.length; i++) {

                System.out.println(String.format("Tamaño de arreglo: %s", sizes[i]));
                data += String.format("Tamaño de arreglo (%s) %n", sizes[i]);
                for (int j = 1; j <= 10; j++) {

                    System.out.println(String.format("Corrida %s", j));
                    int[] arr = new int[sizes[i]];
                    long s, e, time;
                    llenar(arr, sizes[i]);

                    s = System.nanoTime();
                    methods[m].run(arr);
                    e = System.nanoTime();
                    time = e - s;

                    data += String.format("Corrida %s (Segundos): %s %n", j, time / 1000);

                }

            }

            try {
                File file = new File(String.format(".%s%s", File.separator, methods[m].getFileName()));
                FileWriter writer = new FileWriter(file);

                writer.write(data);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

}
