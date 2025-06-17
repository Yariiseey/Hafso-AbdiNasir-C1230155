import java.util.Scanner;

public class Plindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        StringBuilder reverse = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }

        if (word.equals(reverse.toString())) {
            System.out.println(word + " is  palindrome!");
        } else {
            System.out.println(word + " is not  palindrome!!!");
        }
    }
}