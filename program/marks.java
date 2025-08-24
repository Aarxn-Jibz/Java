/**Write a program to input the marks and receive percentage received as output
 */
import java.util.Scanner;
class marks
{
 public static void main()
 {
     double m,p;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter marks (out of 100)");
     m=sc.nextDouble();
     p=(m/100)*100;
     System.out.println("The percentage is "+p+"%");
    }
}
     