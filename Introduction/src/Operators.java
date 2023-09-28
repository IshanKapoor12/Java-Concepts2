public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators (+,-,*,/)
        int first = 10;
        int second = 5;

        int add = first + second; // addition
        System.out.println(add);

        int sub = first - second; // subtraction
        System.out.println(sub);

        int mul = first * second; // multiplication
        System.out.println(mul);

        int div = first / second; // division
        System.out.println(div);

        // Abbreviating Operators (++,--,+=,-=,*=,/=)
        int count = 0;

        count++; // Post-fix Increment
        System.out.println(count);

        count--; // Post-fix Decrement
        System.out.println(count);

        count += 10; // Compound Addition
        System.out.println(count);

        count -= 5; // Compound Subtraction
        System.out.println(count);

        count *= 4; // Compound Multiplication
        System.out.println(count);

        count /= 2; // Compound Division
        System.out.println(count);

        // Relational Operators (=,==,>=,<=,!=,>,<)

        boolean isAlien = false; // Assignment Operator
        if(isAlien == false){ // Equality Operator
            System.out.println("It is not an alien.");
        }

        int age = 20;
        if(age >= 18){ // Greater than or Equal to
            System.out.println("Eligible to vote");
        }

        if(age < 18){ // Less than
            System.out.println("Not Eligible to vote");
        }

        if(age <= 20){ // Less or Equal to
            System.out.println("Not allowed to drink");
        }

        if(age > 20){ // Greater than
            System.out.println("Allowed to drink");
        }

        if(age!=21){ // Not Equal to
            System.out.println("You weren't born in 2002");
        }

        // Logical Operators (&&,||,!)

        int a = 10, b = 20, c = 20;
        if ((a < b) && (b == c)) { // AND
            int d = a + b + c;
            System.out.println("The sum is: " + d);
        }

        if ((a > b) || (b == c)) { // OR
            System.out.println("One or both the conditions are true");
        }

        boolean e = false;
        System.out.println(!e); // NOT

        // Ternary Operator (shortcut of if-else)
        // Condition ? Operand1 (if condition is true) : Operand2 (if condition is false)

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Adult." : "Still a kid.";
        System.out.println("Our client is " + ageText);
    }
}
