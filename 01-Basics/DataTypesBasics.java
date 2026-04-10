public class DataTypesBasics {
    
    public static void main(String[] args) {
        System.out.println("--- Concept 1: Variables & Data Types ---");

        // 1. Primitive Data Types (Memory mein fixed space lete hain)
        int targetLPA = 15;             // Integer
        double currentCGPA = 8.5;       // Decimal values
        char grade = 'A';               // Single character
        boolean isPlacementReady = false; // True or False

        // 2. Non-Primitive Data Type (Reference types)
        String name = "Hammad";         // Text string

        System.out.println("Hello, " + name + "!");
        System.out.println("Current CGPA: " + currentCGPA + " (Grade: " + grade + ")");
        System.out.println("Target Package: " + targetLPA + " LPA");

        System.out.println("\nStatus: Am I placement ready yet? -> " + isPlacementReady);
        System.out.println("Lekin June tak mehnat aur DSA karke isko 'true' karna hai!");
        
        // Note: Java strongly typed language hai, isliye variable ka type pehle batana zaroori hai.
    }
}