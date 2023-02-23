package U1.P18;

public class NumerosPrimos {

    public static void main(String[] argentinos) {
        long ini = System.nanoTime();
        boolean isPrim = calcPrimNoEff(1_000_000_019);
        long fin = System.nanoTime();
        ini = System.nanoTime();
        boolean isPrim2 = calcPrimEff(1_000_000_019);
        fin = System.nanoTime();
        System.out.println(String.format("Es primo: %s", isPrim ? "Si" : "No"));
        System.out.println(String.format("Tiempo: %s", (fin - ini)));
        System.out.println(String.format("Es primo: %s", isPrim2 ? "Si" : "No"));
        System.out.println(String.format("Tiempo: %s", (fin - ini)));
    }

    public static boolean calcPrimNoEff(int num) {
        boolean isPrim = true;

        for (int i = 2; i <= num-1; i++) {

            int val = num % i;
            if (val == 0) {
                isPrim = false;
                break;
            }

        }

        return isPrim;

    }

    public static boolean calcPrimEff(int num) {
        boolean isPrim = true;

        for (int i = 2; i <= (int)Math.sqrt(num); i++) {

            double val = num % i;
            if (val == 0) {
                isPrim = false;
                break;
            }

        }

        return isPrim;

    }

}
