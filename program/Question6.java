/**
 * Check if number is 3 digit number or not
 */
import java.util.Scanner;
public class Question6
{
 public static void main()
 {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");
     n=sc.nextInt();
     if (n>=100 && n<=999)
     System.out.println("The given number is a three digit number");
     else
     System.out.println("The given number is not a three digit number");
    }
}
