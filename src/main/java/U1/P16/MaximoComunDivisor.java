package U1.P16;

public class MaximoComunDivisor {

    public static void main(String[] args) {
        int res = gcd(180, 48);
        System.out.println(res);
    }

    public static int gcd(int dividendo, int divisor) {

        if (divisor > 0) {
            int residuo = dividendo%divisor;
            return gcd(divisor, residuo);
        } else {
            return dividendo;
        }

    }

}
