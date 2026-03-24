package Practice1;

public class ByteDatatype {
    public static void main(String[] args) {
        // Basic example
        byte a = 65;
        System.out.println("Value: " + a);

        // Type casting example (overflow)
        byte b = (byte) 130;
        System.out.println("After casting (130): " + b); // -126

        // Another example (wrap around)
        byte c = (byte) 300;
        System.out.println("After casting (300): " + c); // 44

        // Compile-time error example (invalid range)
        // byte d = 300; // ❌ Error: value out of range for byte
    }
}
