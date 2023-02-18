package U1.P13;

import java.util.Scanner;

public class Captura_Calif {

    public static void main(String[] args) {
        int arr[][][];
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos grupos existen?");

        int grupos = input.nextInt();
        arr = new int[grupos][][];

        //-----
        for (int i = 0; i < arr.length; i++) {
            //por  cada grupo, preguntar cuantos alumnos tiene
            System.out.println("Cuantos alumnos tiene el grupo " + i);
            int noAlumnos = input.nextInt();
            arr[i] = new int[noAlumnos][];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Cuantas materias tiene el alumno " + j);

                int noMaterias = input.nextInt();
                arr[i][j] = new int[noMaterias];

                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Calificaciones de materia " + k);
                    int califa = input.nextInt();
                    arr[i][j][k] = califa;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Grupo " + i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Estudiante " + j + " : ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("[" + arr[i][j][k] + "]");
                }
                System.out.println("");
            }

        }
    }

}
