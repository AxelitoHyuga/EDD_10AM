package U1.P12;

import java.util.Scanner;

public class Arreglo_Multi_2 {

    public static void main(String[] args) {
        /*int[][] arr = new int[3][];

        // Grupo 1: 40 alumnos
        arr[0] = new int[40];
        // Grupo 2: 10 alumnos
        arr[1] = new int[10];
        // Grupo 3: 25 alumnos
        arr[2] = new int[25];*/

        // Capturar la cantidad de grupos
        // Por cada grupo, capturar calificaciones
        int[][] arreGpos;
        Scanner input = new Scanner(System.in);
        // Solicitar la cantidad de grupos
        System.out.println("Introduce la cantidad de grupos: ");

        int grupos = input.nextInt();
        arreGpos = new int[grupos][];// Declarando un arreglo de arreglos
        //  los datos
        for (int i = 0; i < arreGpos.length; i++) {
            System.out.println("Grupo " + i);
            System.out.println("¿Cuántos estudiantes tiene?");
            int estu = input.nextInt();
            arreGpos[i] = new int[estu];
            for (int j = 0; j < arreGpos[i].length; j++) {
                System.out.println("Estudiante: " + j);
                System.out.println("Calificacion: ");
                int califa = input.nextInt();
                arreGpos[i][j] = califa;
            }
        }
        for (int i = 0; i < arreGpos.length; i++) {//filas
            for (int j = 0; j < arreGpos[i].length; j++) {//2da dim
                System.out.print("[" + arreGpos[i][j] + "]");

            }
            System.out.println("");
        }
    }

}
