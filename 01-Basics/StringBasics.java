import java.util.Scanner;

public class StringBasics {

    public static int countVowels(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- Strings Basics ---");
        Scanner sc = new Scanner(System.in);
        
        String firstName = "Hammad";
        String lastName = "Rizvi";
        
        // 1. Concatenation (Jodna)
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        
        // 2. Length & charAt
        System.out.println("Length: " + fullName.length());
        System.out.println("First Character: " + fullName.charAt(0));
        System.out.println("Contains 'Riz': " + fullName.contains("Riz"));
        System.out.println("Index of space: " + fullName.indexOf(' '));
        System.out.println("Last index of a: " + fullName.lastIndexOf('a'));
        
        // 3. Substring (Chhota hissa nikalna)
        System.out.println("First name extracted: " + fullName.substring(0, 6));
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());

        String messyText = "   Java Basics   ";
        System.out.println("Trimmed text: '" + messyText.trim() + "'");

        String sentence = "Java is simple and powerful";
        String[] words = sentence.split(" ");
        System.out.println("Word count: " + words.length);
        System.out.println("Vowel count in full name: " + countVowels(fullName));

        // 4. Comparison
        String s1 = new String("Java");
        String s2 = new String("Java");
        
        // Galti: s1 == s2 false aayega memory allocation ki wajah se
        if(s1.equals(s2)) {
            System.out.println("Strings are equal (Correct way)!");
        }

        System.out.println("CompareTo result: " + s1.compareTo("Java"));
        System.out.println("Equals ignore case: " + s1.equalsIgnoreCase("java"));

        String palindrome = "Level";
        System.out.println("Is '" + palindrome + "' a palindrome? " + isPalindrome(palindrome));

        String replaceExample = fullName.replace("Hammad", "Md.");
        System.out.println("After replace: " + replaceExample);

        System.out.println("Starts with Hammad: " + fullName.startsWith("Hammad"));
        System.out.println("Ends with Rizvi: " + fullName.endsWith("Rizvi"));
        
        sc.close();
    }
} 
