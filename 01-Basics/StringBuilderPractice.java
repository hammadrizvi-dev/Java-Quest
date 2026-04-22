public class StringBuilderPractice {

    public static String buildGreeting(String name, int age) {
        StringBuilder greeting = new StringBuilder();
        greeting.append("Name: ").append(name);
        greeting.append(", Age: ").append(age);
        return greeting.toString();
    }

    public static void main(String[] args) {
        System.out.println("--- StringBuilder & Reverse String ---");
        
        StringBuilder sb = new StringBuilder("Hammad");
        
        // Operations
        sb.append(" Rizvi"); // End me add kiya
        System.out.println("After Append: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        
        sb.setCharAt(0, 'M'); // H ko M bana diya
        System.out.println("After setCharAt: " + sb);
        
        sb.delete(0, 1); // M ko delete kiya
        sb.insert(0, 'H'); // Wapas H laya
        System.out.println("Back to normal: " + sb);

        sb.replace(0, 6, "Hammad");
        System.out.println("After replace: " + sb);

        System.out.println("Character at index 2: " + sb.charAt(2));
        System.out.println("Substring from 0 to 6: " + sb.substring(0, 6));

        StringBuilder temp = new StringBuilder("Java");
        temp.append(" Quest");
        temp.reverse();
        System.out.println("Built-in reverse: " + temp);
        
        // --- REVERSE A STRING LOGIC (Most Important) ---
        StringBuilder name = new StringBuilder("PLACEMENT");
        
        for(int i = 0; i < name.length() / 2; i++) {
            int frontIndex = i;
            int backIndex = name.length() - 1 - i; // Aakhri index nikalna
            
            char frontChar = name.charAt(frontIndex);
            char backChar = name.charAt(backIndex);
            
            // Swap karna
            name.setCharAt(frontIndex, backChar);
            name.setCharAt(backIndex, frontChar);
        }
        
        System.out.println("Reversed String: " + name);

        StringBuilder loopBuilder = new StringBuilder();
        for(int i = 1; i <= 5; i++) {
            loopBuilder.append(i);
            if(i < 5) {
                loopBuilder.append("-");
            }
        }
        System.out.println("Built with loop: " + loopBuilder);

        System.out.println(buildGreeting("Hammad", 21));
    }
}