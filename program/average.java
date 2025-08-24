/**Write a program that inputs calculates and displays the value of three numbers
 */
import java.util.Scanner;
class average
{
 public static void main()
 {
     double a,b,c,avg;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number");
     a=sc.nextDouble();
     System.out.println("Enter second number");
     b=sc.nextDouble();
     System.out.println("Enter third number");
     c=sc.nextDouble();
     avg=((a+b+c)/3);
     System.out.println("The average of three numbers is "+avg);
    }
}
     