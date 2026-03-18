package Practice1;

// Program: Datatypes Size Check
// Description: Prints size of Java primitive data types and explains range & combinations.

public class Datatypes_size_check1 {

    public static void main(String[] args) {

        System.out.println("Byte size (in bytes): " + Byte.BYTES);
        // 1 byte = 8 bits → 2^8 = 256 combinations
        // Range = -2^(8-1) to 2^(8-1)-1 → -128 to 127

        System.out.println("Short size (in bytes): " + Short.BYTES);
        // 2 bytes = 16 bits → 2^16 = 65,536 combinations
        // Range = -2^(16-1) to 2^(16-1)-1 → -32,768 to 32,767

        System.out.println("Integer size (in bytes): " + Integer.BYTES);
        // 4 bytes = 32 bits → 2^32 combinations
        // Range = -2^(32-1) to 2^(32-1)-1
        // → -2,147,483,648 to 2,147,483,647

        System.out.println("Long size (in bytes): " + Long.BYTES);
        // 8 bytes = 64 bits → 2^64 combinations
        // Range = -2^(64-1) to 2^(64-1)-1
        // → -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        System.out.println("Float size (in bytes): " + Float.BYTES);
        // 4 bytes (32-bit floating point)
        // Used for decimal numbers (range differs from integers)

        System.out.println("Double size (in bytes): " + Double.BYTES);
        // 8 bytes (64-bit floating point)
        // More precision than float

        System.out.println("Character size (in bytes): " + Character.BYTES);
        // 2 bytes = 16 bits → 65,536 Unicode characters

        // Note:
        // boolean size is not fixed (JVM dependent)
    }
}
