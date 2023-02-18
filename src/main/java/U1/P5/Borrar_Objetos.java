package U1.P5;

public class Borrar_Objetos {

    public static void main(String[] args) {
        Read r = new Read();
        System.out.println(r);
        r = null;
        System.out.println(r);
    }

}

class Read {}
