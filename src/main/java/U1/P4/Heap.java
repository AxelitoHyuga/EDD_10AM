package U1.P4;

import java.util.Scanner;

public class Heap {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        System.out.println(person1);
        capturarDatos(person1);
        System.out.printf("Nombre: %s %n", person1.getNombre());
        System.out.printf("Edad: %s", person1.getEdad());
    }

    public static void capturarDatos(Persona person) {
        System.out.println(person);
        Scanner input = new Scanner(System.in);
        person.setNombre(input.nextLine());
        person.setEdad(input.nextInt());
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Axel";
        this.edad = 19;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}