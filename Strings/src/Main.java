// Text Block: Multi-line string literals
// Escape Sequences:
// 1. \t - Tab Character
// 2. \n - New Line Character
// 3. \" - Double Quote Character
// 4. \\ - Backlash Character

public class Main {
    public static void main(String[] args) {

        // \u2022 - unicode for bullet point.
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        // """ - used to print multi-line strings.
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        // format specifiers

        int age = 20;
        System.out.printf("My age is %d %n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d %n", age, yearOfBirth);

        System.out.printf("My age is %.2f %n", (float) age);

        for(int i=1;i<=100000;i*=10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}