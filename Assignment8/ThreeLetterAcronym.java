import java.util.Scanner;
public class ThreeLetterAcronym {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Word:");
        String firstWord = input.nextLine();
        System.out.println("Second Word:");
        String secondWord = input.nextLine();
        System.out.println("Third Word:");
        String thirdWord = input.nextLine();

        System.out.print(firstWord.charAt(0));
        System.out.print(secondWord.charAt(0));
        System.out.print(thirdWord.charAt(0));
    }
}
