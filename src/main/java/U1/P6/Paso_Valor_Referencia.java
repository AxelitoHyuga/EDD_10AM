package U1.P6;

public class Paso_Valor_Referencia {

    public static void main(String[] args) {
        int valor = 10;
        System.out.printf("Valor = %s%n", valor);
        increment(valor);
        System.out.printf("Valor = %s%n", valor);
        ////
        MiValor miVal = new MiValor();
        System.out.println("Obj valor = " + miVal.valor);
        incrementRef(miVal);
        System.out.println("Obj valor = " + miVal.valor);
    }

    public static void increment(int val) {
        val++;
    }

    public static void incrementRef(MiValor val) {
        val.valor++;
    }

}

class MiValor {
    int valor = 10;
}