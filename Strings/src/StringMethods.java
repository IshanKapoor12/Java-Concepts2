// String Methods
// 3 basic categories:
// 1. String Inspection Methods
// 2. String Comparison Methods
// 3. String Manipulation Methods

public class StringMethods {
    public static void main(String[] args) {
        printInfo("Hello World");
        printInfo("");
        printInfo("\n    \t");

        String str = "Hello World";
        System.out.printf("Index of r = %d %n", str.indexOf("r"));
        System.out.printf("Index of World = %d %n", str.indexOf("World")); // Gives the index of the first letter

        System.out.printf("Index of first l = %d %n", str.indexOf("l")); // Gives the index of the first occurrence of l starting from the beginning of the string.
        System.out.printf("Index of last l = %d %n", str.lastIndexOf("l")); // Gives the index of the first occurrence of l starting from the end of the string.

        System.out.printf("Index of l = %d %n", str.indexOf("l", 3)); // Search for index of l starts from the second argument.

        printInfo(str);

        String birthDate = "05/04/2003";
        int yearIndex = birthDate.indexOf("2003");

        System.out.println("Birth year = " + birthDate.substring(yearIndex));

        System.out.println("Birth month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "05", "04", "2003");
        System.out.println("New Date = " + newDate);

        newDate = "05";
        newDate = newDate.concat("/");
        newDate = newDate.concat("04");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2003");
        System.out.println("New Date = " + newDate);

        newDate = "05" + "/" + "04" + "/" + "2003";
        System.out.println("New Date = " + newDate);

        newDate = "05".concat("/").concat("04").concat("/").concat("2003");
        System.out.println("New Date = " + newDate);

        System.out.println("New Date = " + newDate.replace("/", "-"));

        System.out.println("New Date = " + newDate.replaceFirst("/", "-"));

        System.out.println("New Date = " + newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }

    public static void printInfo(String string){

        // String Inspection Methods
        // length, charAt, indexOf, lastIndexOf, isEmpty, isBlank

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){ // Empty means no characters at all
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()){ // Blank means it has characters like newline and tab
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));

        // String Comparison Methods
        // contentEquals, equals, equalsIgnoreCase, contains
        // endsWith, startsWith, regionMatches
        // indent, strip, stripLeading, stringTrailing, trim
        // toLowerCase, toUpperCase, concat, join, repeat
        // replace, replaceAll, replaceFirst, substring, subSequence

        String stringLower = string.toLowerCase();

        if(string.equals(stringLower)){
            System.out.println("Values match exactly");
        }

        if(string.equalsIgnoreCase(stringLower)){
            System.out.println("Values match ignoring case");
        }

        if(string.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if(string.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(string.contains("llo")){
            System.out.println("String contains llo");
        }

        if(string.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }
}
