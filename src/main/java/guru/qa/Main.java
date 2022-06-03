package qa.guru;

public class Main {

    public static void primitiveData() {

        byte byteValue = 110;
        short shortValue = 28923;
        int intValue = -147_483_647;
        long longValue = 435346L;
        float floatValue = 44.4F;
        double doubleValue = 322.00;
        char charValue = 'k';
        boolean booleanValue = true;

        System.out.println("Example of byte: " + byteValue);
        System.out.println("Example of short: " + shortValue);
        System.out.println("Example of int: " + intValue);
        System.out.println("Example of long: " + longValue);
        System.out.println("Example of float: " + floatValue);
        System.out.println("Example of double: " + doubleValue);
        System.out.println("Example of char: " + charValue);
        System.out.println("Example of boolean: " + booleanValue);
        System.out.println();
    }

    public static void arithmeticOperations() {
        int a = 10;
        int b = 20;
        double c = 30;
        double d = 40;
        int result = ++a;
        double result2 = d--;
        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(c + d);
        System.out.println(d - c);
        System.out.println(a * d);
        System.out.println(d / b);
        System.out.println(result);
        System.out.println(result2);
        System.out.println();
    }

    public static void stackOverflow() {
        int intMax = 2_147_483_647;
        System.out.println(intMax + 1);
        //(int overflow max)

        short shortMin = -32768;
        System.out.println(shortMin - 1);
        //(int overflow min)

        long longMax = 9_223_372_036_854_775_807L;
        System.out.println(longMax + 1);
    }



    public static boolean between10and100(int number) {

        return (number >= 10) && (number <= 100);

        //* Check that input integer belongs to the segment 100 to 100 (inclusive).
    }

    public static void main(String[] args) {
        primitiveData();
        arithmeticOperations();
        stackOverflow();
        between10and100(25);

    }
}
