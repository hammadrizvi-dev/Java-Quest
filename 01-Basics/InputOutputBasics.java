import java.util.Scanner; // Input lene ke liye isko import karna zaroori hai

public class InputOutputBasics {
    
    public static void main(String[] args) {
        System.out.println("--- User Input in Java ---");

        // Scanner object banana padta hai user se input lene ke liye
        Scanner sc = new Scanner(System.in);

        // 1. String Input
        System.out.print("Apna naam batao: ");
        String name = sc.nextLine(); // Poori line read karta hai

        // 2. Integer Input
        System.out.print("Aaj kitne ghante padhai (coding) ki? ");
        int studyHours = sc.nextInt();

        // 3. Double Input
        System.out.print("Gym mein workout ko kitne ghante diye? ");
        double gymHours = sc.nextDouble();

        System.out.println("\n--- Daily Tracker Report ---");
        
        // Output aur logic check
        if (studyHours >= 7 && gymHours >= 1.5) {
            System.out.println("Great job, " + name + "! Solid discipline. Aisi hi consistency June tak rahi toh placement aur health dono set hain.");
        } else {
            System.out.println("Keep pushing, " + name + ". Routine maintain rakhna bohot zaroori hai.");
        }

        // Memory leak se bachne ke liye scanner close karna best practice hai
        sc.close();
    }
} 
