package U1.P8;

public class Arreglos {

    public static void main(String[] args) {
        int[] arrDatos = new int[50];

        System.out.println(arrDatos);

        String[] arrStr = new String[30];

        System.out.println(arrStr);

        for (int i = 0; i < 50; i++) {
            arrDatos[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arrDatos[i] + "]");
        }
    }

}
