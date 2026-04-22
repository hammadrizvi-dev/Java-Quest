public class TypeCasting {
    
    public static void main(String[] args) {
        System.out.println("--- Type Casting in Java ---");

        // 1. Implicit Type Casting (Widening - Chhote se Bada)
        // Ye Java khud kar leta hai, data loss nahi hota.
        int dailyStudyHours = 7;
        double doubleStudyHours = dailyStudyHours; 
        
        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + dailyStudyHours);
        System.out.println("Converted to Double: " + doubleStudyHours + " (Notice the .0 added naturally)\n");

        // 2. Explicit Type Casting (Narrowing - Bade se Chhota)
        // Ye humein manually karna padta hai, data loss ho sakta hai.
        double exactGymTime = 2.45;
        int roundedGymTime = (int) exactGymTime; // Decimal part remove ho jayega
        
        System.out.println("Explicit Casting:");
        System.out.println("Original Double value: " + exactGymTime);
        System.out.println("Converted to Integer: " + roundedGymTime + " (Decimal part lost!)");
    }
} 
