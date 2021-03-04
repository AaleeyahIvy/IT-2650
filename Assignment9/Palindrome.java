import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrome = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a sentence:");
        StringBuilder sentence = new StringBuilder(input.nextLine());
        StringBuilder reversedSentence = new StringBuilder(sentence).reverse();
    
        String sentence1 = sentence.toString(); //stringbuider -> string
        String reversedSentence1 = reversedSentence.toString(); //stringbuider -> string

        if(sentence1.replaceAll("\\s", "").equals(reversedSentence1.replaceAll("\\s", ""))){ //remove white space then compare strings
            isPalindrome = true;
            System.out.println("Valid Palindrome? " + isPalindrome);
        }
        else {
            System.out.println("Valid Palindrome? False"); //falsy value
        }
    }
    
}
