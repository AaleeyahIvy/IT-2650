import java.util.Scanner;
public class SqrtException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = input.nextInt();
        Float result = (float)Math.sqrt(number);
        try{
        if(result.isNaN()){
            throw new ArithmeticException();
        }
            System.out.println("Number is " + number + " and the square root is " + result);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot compute square root of negative number");
        }
        finally {
            input.close();
        }
    }
}