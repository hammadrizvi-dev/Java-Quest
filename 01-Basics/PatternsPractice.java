public class PatternsPractice {
    public static void main(String[] args) {
        System.out.println("--- Half Pyramid Pattern ---");
        int n = 4; // Rows
        
        // Outer loop for rows
        for(int i = 1; i <= n; i++) {
            // Inner loop for columns
            for(int j = 1; j <= i; j++) {
                System.out.print("* "); // Star print karega
            }
            System.out.println(); // Next line
        }

        System.out.println();
        System.out.println("--- Square Pattern ---");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--- Inverted Half Pyramid ---");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--- Number Pattern ---");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}