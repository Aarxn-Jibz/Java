/**
 * Write a program to take the principal, rate, time as input and print the Simple interest as output
 */
import java.util.Scanner;   //to import scanner
class SI                    //opening class
{
 public static void main()  //opening void main
 {
     double p,r,t,si;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Principal");
     p=sc.nextDouble();
     System.out.println("Enter Rate");
     r=sc.nextDouble();
     System.out.println("Enter time(in years)");
     t=sc.nextDouble();
     si=((p*t*r)/100);
     System.out.println("The Simple Interest is "+si);
    }                      //closing void main
}                          //closing class
     