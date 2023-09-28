public class Main {

    // Print numbers from 5 to 1.
    public static void printNumbers1(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers1(n-1);
    }

    // Print numbers from 1 to 5.
    public static void printNumbers2(int n) {
        if(n == 6) {
            return;
        }
        System.out.println(n);
        printNumbers2(n+1);
    }

    // Print sum of first n natural numbers.
    public static int printSum(int n) {
        if(n == 0) {
            return 0;
        }
        int prevSum = printSum(n-1);
        return n + prevSum;
    }

    // Print factorial of a number n
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int prevFactorial = factorial(n-1);
        return n*prevFactorial;
    }

    // Print the fibonacci sequence till nth term
    public static void fibonacci(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }

    // Print the number raised to another number (x^n)
    public static int printPow(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int prevPow = printPow(x, n-1);
        return x*prevPow;
    }

    public static void main(String[] args) {
        printNumbers1(5);

        printNumbers2(1);

        System.out.println(printSum(5));

        System.out.println(factorial(5));

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(a);
        int n = 5;
        fibonacci(a, b, n-2);

        System.out.println(printPow(5, 3));
    }
}