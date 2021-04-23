import java.util.Arrays;
import java.util.Scanner;
class DaysOfWeek {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        int position = 0;
        Day day = null;
        Scanner input =  new Scanner(System.in);
        System.out.println(Arrays.toString(Day.values()));
        for(int i = 0; i < 7; i++){
        System.out.println("Please pick a day: ");
        String userInput = input.nextLine().toUpperCase();
        day = Day.valueOf(userInput);
        System.out.println("You entered: " + day);
        position = day.ordinal();
        System.out.print(day + "'s Business Hours: ");
        if(position == 5){
            System.out.println("9 A.M to 6 P.M");
        }
        if(position == 6){
            System.out.println("8 A.M to 4 P.M");
        }
        else {
            System.out.println("11 A.M to 6 P.M");
            }
        }
    }
}