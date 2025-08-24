/**Write a program to input two integers and print their sum,sum of squares and sum of
 * cubes
 */
import java.util.Scanner;
class multi
{
 public static void main()
 {
     int a,b,s,sq,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number");
     a=sc.nextInt();
     System.out.println("Enter second number");
     b=sc.nextInt();
     s=a+b;
     sq=(a*a)+(b*b);
     c=(a*a*a)+(b*b*b);
     System.out.println("The sum of the number are "+s);
     System.out.println("The sum of the squares of the number are "+sq);
     System.out.println("The sum of the cubes of the number are "+c);
    }
}