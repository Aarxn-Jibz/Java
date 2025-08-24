
/**Write a program to take the side of a cube as input and display total surface area,
 *lateral surface area, volume and length of diagonal.  
 */
import java.util.Scanner;

public class cube
{
 public static void main()
	{
		double a,S,s,v,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of cube");
		a=sc.nextDouble();
		S=6*a*a;
		s=4*a*a;
		v=a*a*a;
		d=Math.sqrt(3)*a;
		System.out.println("The Total Surface Area is "+S);
		System.out.println("The Lateral Surface Area is "+s);
		System.out.println("The Volume is "+v);
		System.out.println("The Length of Diagonal is "+d);
}
}