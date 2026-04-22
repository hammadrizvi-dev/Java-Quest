import java.util.Scanner;

public class FunctionsBasics {
    
    // Function to calculate Factorial
    // This code is only for factorial and small function examples.
    public static void calculateFactorial(int n) {
        if(n < 0) {
            System.out.println("Invalid Number");
            return; // Function yahi se wapas laut jayega
        }
        int fact = 1;
        for(int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    // Recursion version of factorial
    public static int calculateFactorialRecursive(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }

    // Higher level function example: sum of first n numbers
    public static int sumOfFirstN(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function overloading example
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void printTable(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Functions in Java ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Function Calling
        calculateFactorial(num);

        int recursiveFact = calculateFactorialRecursive(num);
        if(recursiveFact == -1) {
            System.out.println("Recursive factorial is not valid for negative numbers");
        } else {
            System.out.println("Recursive Factorial of " + num + " is: " + recursiveFact);
        }

        System.out.println("Sum of first " + num + " numbers is: " + sumOfFirstN(num));
        System.out.println("Add int values: " + add(10, 20));
        System.out.println("Add double values: " + add(10.5, 20.5));

        System.out.println("Table of " + num + ":");
        printTable(num);
        
        sc.close();
    }
}