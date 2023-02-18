package U1.P14;

public class Recursividad {

    public static void main(String[] args) {
//        recursivo();
//        for (int i = 10; i >= 1; i--) {
//            System.out.print(i + " - ");
//        }
        falsoFor(10);
        System.out.println("");
        falsoFor2(10, 1);
    }

    public static void recursivo() {
        System.out.println("Hola stackoverflow !!");
        recursivo(); // Recursividad: el método se llama a si mismo
    }

    public static void falsoFor(int valor) {
        System.out.print(valor + " - ");
        if (valor > 1) {
            falsoFor(valor - 1);
        }
    }

    public static void falsoFor2(int max, int valor) {
        System.out.print(valor + " - ");
        if (valor < max)
            falsoFor2(max,valor + 1);
    }

}
