public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Whole Numbers

        // int (Wrapper Class: Integer) , width = 32 bits (DEFAULT)
        int myValue = 10000;
        System.out.println(myValue);

        System.out.println("An int has a width of " + Integer.SIZE); // WrapperClass.SIZE is used to find the width of the data type.

        int myMinIntValue = Integer.MIN_VALUE; // Integer can't store a value lesser than this.
        int myMaxIntValue = Integer.MAX_VALUE; // Integer can't store a value greater than this.
        System.out.println("Integer value range (" + myMinIntValue + " to " + myMaxIntValue + ")");

        System.out.println("The maximum integer value = " + 2_147_483_647); // We can use _ instead of , with in data type.

        // byte (Wrapper Class: Byte), width = 8 bits
        System.out.println("A byte has a width of " + Byte.SIZE); // WrapperClass.SIZE is used to find the width of the data type.

        System.out.println("Byte value range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");

        // short (Wrapper Class: Short), width = 16 bits
        System.out.println("A short has a width of " + Short.SIZE); // WrapperClass.SIZE is used to find the width of the data type.

        System.out.println("Short value range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");

        // long (Wrapper Class: Long) , width = 64
        long myLongValue = 100L; // Suffix L is used to indicate long data type. It is necessary for numbers > Integer.MAX_VALUE and numbers < Integer.MIN_VALUE.
        System.out.println(myLongValue);

        System.out.println("A long has a width of " + Long.SIZE); // WrapperClass.SIZE is used to find the width of the data type.

        System.out.println("Long value range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        // Floating Point Numbers / Real Numbers

        // float (Wrapper Class: Float), width = 32

        // float myFloat = 5.25; // error because deafult is double and it is assigned to a float.
        float myFloat = 5.25F; // error removed by using 'F' as a suffix to make 5.25 a float.
        System.out.println(myFloat);

        System.out.println("A float has a width of " + Float.SIZE);

        System.out.println("Float value range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");

        // double (Wrapper Class: Double), width = 64 (DEFAULT)

        System.out.println("A double has a width of " + Double.SIZE);

        System.out.println("Double value range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        // char (Wrapper Class: Character), width = 16
        // can hold only a single character enclosed in single quotes ''

        char literalCharacter = 'D'; // direct assignment of the literal char to a variable.
        System.out.println(literalCharacter);

        char unicodeValue = '\u0044'; // Unicode value of D assigned to the variable.
        System.out.println(unicodeValue);

        char integerValue = 68; // ASCII value of D assigned to the variable.
        System.out.println(integerValue);

        char firstChar = 'A';
        char secondChar = 'B';

        System.out.println(firstChar + secondChar); // It doesn't give 'AB' as output but gives 131 as it adds their ASCII values.

        System.out.println("" + firstChar + secondChar); // Here an empty String helps to concatenate the chars which cannot be concatenated on their own.

        // boolean (Wrapper Class: Boolean)
        // can have 2 values: true or false
        // prefixes like 'is' and 'has' are used before variables for boolean data types.
        boolean myTrueBooleanValue = true;
        System.out.println(myTrueBooleanValue);

        boolean myFalseBooleanValue = false;
        System.out.println(myFalseBooleanValue);

        // String: It is a Class but can be used as a primitive data type.
        // Strings are immutable which means it can't be changed after its created.

        String myString = "Hello";
        System.out.println(myString + " World!"); // Concatenation

        String str = "10";
        int myInt = 50;
        System.out.println(str + myInt); // String + Anything else gives a string (concatenation). myInt gets converted to a String.
    }
}
