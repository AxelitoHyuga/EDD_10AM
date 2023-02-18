package U1.P7;

public class Copia_Objetos {

    public static void main(String[] args) {
        /*
            -- Un objeto no se puede duplicar como un "int" por ejemplo, por que unicamente se copiaria la dirección del objeto.
            -- -- Ejemplo con int:
            int i1 = 10;
            int i2 = i1;
         */

        /*
            -- Manera incorrecta de duplicar un objeto
            Persona p1 = new Persona();
            Persona p1Copy = p1;
         */

        // Manera correcta de duplicar un objeto
        Persona p1 = new Persona();
        p1.name = "Axel";
        Persona p1Copy = new Persona();
        p1Copy.name = p1.name;
        System.out.println(p1.name);
        p1Copy.name = "Roberto";
        System.out.println(p1Copy.name);
        System.out.println(p1.name);
    }

}

class Persona {
    String name;
}
