public class TypeCastingExample {
    public static void main(String[] args) {

        // Widening Type Casting (Implicit)
        int num = 100;
        double dNum = num;

        System.out.println("Widening Casting (int to double): " + dNum);

        // Narrowing Type Casting (Explicit)
        double pi = 3.1416;
        int intPi = (int) pi;

        System.out.println("Narrowing Casting (double to int): " + intPi);

        // Another example with byte
        int x = 130;
        byte b = (byte) x;

        System.out.println("Casting int 130 to byte: " + b);
    }
}
