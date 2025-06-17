
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = sc.nextLine();

        StringBuilder reversed = new StringBuilder(input).reverse();

        if (input.equalsIgnoreCase(reversed.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}