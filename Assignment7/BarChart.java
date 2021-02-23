import java.util.Scanner;
public class BarChart
{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numofPlayers = 5;
        String players[] = {"Ali", "Bob", "Cal", "Dan", "Ell"};

        for(int i = 0; i < numofPlayers; i++)
        {   
            System.out.println("");
            System.out.println("Enter score for: " + players[i]);
            int pts = num.nextInt();
            for(int j = 0; j < pts; j++){
                 System.out.print("=");
            }    
        }
        BarChart bc1 =  new BarChart();
    }
}
