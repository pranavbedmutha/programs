import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Take input
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
            // Convert to lowercase manually (optional)
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    chars[i] = (char)(chars[i] + 32); // convert to lowercase
                }
            }
            
            boolean isPalindrome = true;
            int start = 0;
            int end = chars.length - 1;
            
            // Compare characters from start and end
            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            
            // Result
            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
