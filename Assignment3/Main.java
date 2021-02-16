import java.util.Scanner;
public class Main {
  public static Scanner userInput;

  public static void main(String args[]) {
    userInput = new Scanner(System.in);
    System.out.println("Please enter length, width, height:");
    double length = userInput.nextDouble();
    double width = userInput.nextDouble();
    double height = userInput.nextDouble();
    double area = computeArea(length, width, height);
    double price = computeCost(area);
    System.out.println("Total Area: " + area);
    System.out.println("Total Cost: " + price);
}

  public static double computeArea(double length, double width, double height){ //Calculating the Area needed using l, w and h.
    double area = length * height * 2 + width * height * 2;
    return area;
}

  public static double computeCost(double area){ //Calculating the cost using area.
    final double PRICE_PER_GALLON = 32;
    final double GALLON_PER_FOOT = 350;
    
    double gallons = area / GALLON_PER_FOOT;
    System.out.println("Total gallons needed: " + gallons);
    double price = gallons * PRICE_PER_GALLON;
    return price;
  }
}