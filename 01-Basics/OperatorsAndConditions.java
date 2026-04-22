public class OperatorsAndConditions {
    
    public static void main(String[] args) {
        System.out.println("--- Placement Eligibility Check ---");

        // Input data
        double cgpa = 8.2;
        int activeBacklogs = 0; // Target: Isko hamesha 0 rakhna hai!
        boolean knowsDSA = true;

        System.out.println("Student CGPA: " + cgpa);
        System.out.println("Active Backlogs: " + activeBacklogs);

        // 1. Relational & Logical Operators (&&, ||, !=, ==)
        System.out.println("\n--- Checking Criteria ---");
        
        if (cgpa >= 7.5 && activeBacklogs == 0 && knowsDSA) {
            System.out.println("Result: You are ELIGIBLE for Top Product-Based Companies! 🚀");
        } else if (cgpa >= 6.5 && activeBacklogs <= 1) {
            System.out.println("Result: You are ELIGIBLE for Service-Based Companies.");
        } else {
            System.out.println("Result: Keep studying! Clear the exams and improve skills.");
        }

        // 2. Ternary Operator (One-line if-else -> condition ? true_value : false_value)
        System.out.println("\n--- Quick Status ---");
        String status = (cgpa >= 8.0) ? "Safe Zone" : "Need to grind more";
        System.out.println("Placement Status: " + status);
    }
}
