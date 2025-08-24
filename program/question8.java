
/**Accept a decimal number and calculate how much needs to be added to get its 
 * higher truncated value
 */
import java.util.Scanner;
public class question8
{
	public static void main()
	{
	    double i,a,x;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a decimal number");
	    i=sc.nextDouble();
	    double h=Math.ceil(i);
	    x=h-i;
	    System.out.println(x+" needs to be added to get "+i);
	   }
}