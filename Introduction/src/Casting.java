public class Casting {
    public static void main(String[] args) {
        // int is the default numeric data type.
        // casting is used to prevent error while using other data types.
        // using literals don't throw errors
        // whereas using variables can throw errors if casting not used.

        int minInt = Integer.MIN_VALUE;
        int myTotal = (minInt/2); // no need for casting as int is default numeric data type.
        System.out.println(myTotal);

        short myShortValue = (-128/2);
        System.out.println(myShortValue);

        short myValue = Short.MIN_VALUE;

        // short myNewShortValue = (myValue/2); // error as myValue is assumed to be integer, and it can't be assigned to myNewShortValue which is short.

        short myNewShortValue = (short) (myValue/2); // casting done to remove the error.
        System.out.println(myNewShortValue);

        float myFloat = (float) 5.25;
        System.out.println(myFloat);


    }
}
