
/**Display the sum of all even digits and sum of all odd digits of a number
 */
 import java.util.Scanner;
 class question9
 {
 	public static void main()
 	{
 	    Scanner sc=new Scanner (System.in);
 	    int n,r,e=0,o=0;
 	    System.out.println("Enter number");
 	    n=sc.nextInt();
 	    while (n>0)
 	    {
 	        r=n%10;
 	        n=n/10;
 	        if (r==0 || r==2 || r==4 || r==6 || r==8)
 	        {
 	            e=e+r;
 	          }
 	          else
 	          {
 	              o=o+r;
 	          }
 	      }
 	    System.out.println("Sum of odd numbers="+o);
 	    System.out.println("Sum of even numbers="+e);
 	  }
 }
 	    
	
