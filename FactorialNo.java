import java.util.Scanner;

public class fac
{
   public static void main(String[] args)
   {
      int n, i, fact=1;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      n = s.nextInt();
      
      for(i=n; i>=1; i--)
      {
         fact = fact*i; 
      }
      
      System.out.println("\nFactorial Result = " +fact);
   }
}
