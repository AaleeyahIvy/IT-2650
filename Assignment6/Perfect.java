public class Perfect 
{
public static boolean isPerfect(int num) 
{
    int sum = 0;
    boolean result = false;
    for(int j = 1; j < num; j++) 
        if(num % j == 0) 
            sum += j;
        if(sum == num) 
            return true;
        else 
            return result;
}
    public static void main(String[] args) 
    {
        final int CAP = 1000;
        for(int i = 2; i <= CAP; i++) 
        {
            if(isPerfect(i))
             System.out.println(i + " " + "Is a perfect number");
        } 
    }
}
  
