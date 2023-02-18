package U1.P11;

public class Arreglos_Multi {
    public static void main(String[] args) {
        int[][][][] matrizDatos = new int[3][3][3][3];

        for (int i = 0; i < matrizDatos.length; i++) {

            for (int j = 0; j < matrizDatos[i].length; j++) {

                for (int k = 0; k < matrizDatos[i][j].length; k++) {

                    for (int l = 0; l < matrizDatos[i][j][k].length; l++) {

                        matrizDatos[i][j][k][l] = (int)(Math.random() * 100);

                    }

                }

            }

        }

        for (int i = 0; i < matrizDatos.length; i++) {

            for (int j = 0; j < matrizDatos[i].length; j++) {

                for (int k = 0; k < matrizDatos[i][j].length; k++) {

                    for (int l = 0; l < matrizDatos[i][j][k].length; l++) {

                        System.out.print("[" + matrizDatos[i][j][k][l] + "]");

                    }

                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
