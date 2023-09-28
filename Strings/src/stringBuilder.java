public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello" + " World");
        str.append(" and Goodbye");
        printInfo(str);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(12));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(25));

        printInfo(emptyStart);
        printInfo(emptyStart32);

        // Unique StringBuilder methods
        // delete, deleteCharAt, insert, reverse, setLength

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,"g");
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInfo(StringBuilder builder){

        System.out.println("String Builder = " + builder);
        System.out.println("length = " + builder.length());

        System.out.println("Capacity = " + builder.capacity()); // Default capacity is 16
    }
}
