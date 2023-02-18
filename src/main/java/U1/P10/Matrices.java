package U1.P10;

public class Matrices {

    public static void main(String[] args) {
        int[][] matrizDatos = new int[3][4];
        // Llenar con numeros aleatorios
        // Primer ciclo --> 1er dimensión (filas)
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizDatos[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                System.out.print("["+matrizDatos[i][j]+"]");
            }
            System.out.println("");
        }
    }

}
