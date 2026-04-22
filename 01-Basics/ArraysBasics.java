import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args) {
        System.out.println("--- 1D & 2D Arrays Basics ---");
        Scanner sc = new Scanner(System.in);
        
        // 1. 1D Array Input & Output (Linear Search example)
        int[] numbers = {10, 20, 30, 40, 50}; // Direct initialization
        int target = 30;
        
        System.out.println("Searching for " + target + " in 1D Array:");
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target) {
                System.out.println("Target found at index: " + i);
                break; // Mil gaya toh aage loop chalane ka fayda nahi
            }
        }

        // 2. 2D Array (Matrix Print)
        System.out.println("\n--- 2D Array Output ---");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        }; // 2 rows, 3 columns

        // Nested loops for 2D Arrays
        for(int i = 0; i < matrix.length; i++) { // Rows
            for(int j = 0; j < matrix[i].length; j++) { // Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Next line after each row
        }
        
        sc.close();
    }
}