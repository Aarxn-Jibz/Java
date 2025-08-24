/**Write a program to take the length,breadth and height of a cuboid as input and 
 *display total surface area,lateral surface area, volume and length of diagonal.
 */
import java.util.Scanner;
public class cuboid
{
	public static void main()
	{
	    double l,b,h,S,s,v,d;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter length");
	    l=sc.nextDouble();
	    System.out.println("Enter breadth");
	    b=sc.nextDouble();
	    System.out.println("Enter height");
	    h=sc.nextDouble();
	    S=2*(l*b+b*h+l*h);
	    s=2*(l+b)*h;
	    v=l*b*h;
	    d=Math.sqrt(l*l + b*b + h*h);
	    System.out.println("The Total Surface Area is "+S);
		System.out.println("The Lateral Surface Area is "+s);
		System.out.println("The Volume is "+v);
		System.out.println("The Length of Diagonal is "+d);
    }
}