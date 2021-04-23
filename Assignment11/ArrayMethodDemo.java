import java.util.Scanner;

class ArrayMethodDemo {
    public void printIntegers(int[] integers) {
        System.out.println("These are your integers:");
        for(int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }
    public void reverseIntegers(int[] integers) {
        System.out.println("These are your integers in reverse:");
        for(int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i] + " ");
        }
    }
    public void sumIntegers(int[] integers) {
        int sum = 0;
        for(int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        System.out.println("Sum of integers: " + sum);
    }
    public void lessThan(int[] integers, int constraint) {
        System.out.println("Integers less than " + constraint + ":");
        for(int i = 0; i < integers.length; i++) {
            if(integers[i] < constraint) {
                System.out.println(integers[i]);
            }
        }
    }
    public void higherThanAvg(int[] integers) {
        System.out.println("Integers higher than average: ");
        int avg = 0;
        for(int i = 0; i < integers.length; i++) {
            avg += integers[i] / 10;
            if(integers[i] > avg) {
                System.out.println(integers[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayMethodDemo arrayOne = new ArrayMethodDemo();
        int[] integers = new int[10];
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter a number constraint:");
        int constraint = input.nextInt();

        for(int i = 0; i < integers.length; i++) {
            System.out.println("Please input integer " + (i+1));
            integers[i] = input.nextInt();
        }
        arrayOne.printIntegers(integers);
        arrayOne.reverseIntegers(integers);
        arrayOne.sumIntegers(integers);
        arrayOne.lessThan(integers, constraint);
        arrayOne.higherThanAvg(integers);


    }
}