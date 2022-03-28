public class dataTypes {
    public static void main(String args[]){
        /*
        Primitive data types
        Java has 8 Primitive data types

        1. Byte
            Range -128 to 127, 8-bit signed two's complement integer.

        2. Short
            Range -32,768 to 32,767, 16-bit signed two's complement integer.

        3. Int
            Range 2 to the power of 31 to 2 to the power of 31 -1, 2-bit signed two's complement integer.

        4. Long
            Range 2 to the power of 63 to 2 to the power of 63 -1, 64-bit two's complement integer.

        5. Float
            32-bit floating integers.

        6. Double
            64-bit floating integers.

        7. Boolean
            true or false

        8. Char
            single 16-bit Unicode character , char should be always in a single quote.
         */

        byte b1 = 21;
        short number = 32767;
        int integer = 64000;
        long longNumber = 1234567890;
        double doubleNumber = 123.123;
        float floatNumber = 12.12f;
        boolean boolA = true;
        char alphabet = 'A';

        System.out.println("byte number is " + b1);
        System.out.println("short number is " + number);
        System.out.println("integer number is " + integer);
        System.out.println("long number is " + longNumber);
        System.out.println("double number is " + doubleNumber);
        System.out.println("float number is " + floatNumber);
        System.out.println("char number is " + alphabet);
    }
}
