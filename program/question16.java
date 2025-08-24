/**
 *design a menu driven program to do the following using different functions

1)	to check the number is armstrong number or not.
2)	to display the fibonacci(0,1,1,2,3,5,8.. n terms) series upto n 	terms
3)	to display the pell series upto n terms.


the functions are:

boolean isarmstrong(int): it will return true if the number is armstrong
 			  else returns false 

void fibo(int)		: it will print fibonacci series

void pell(int)	`	: it will print pell series
0,1,2,5,12,29,.. n terms
 */
import java.util.Scanner;
class question16
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c;boolean x;
        System.out.println("Input 1 to find whether a number is armstrong number or not"); 
        System.out.println("Input 2 to print fibonacci series till inputted term");
        System.out.println("Input 3 to print pell series till inputted terms");
        n=sc.nextInt();
        switch (n)
        {
            case (1):
            System.out.println("Input a number");
            a=sc.nextInt();
            x=isarmstrong(a);
            if (x==true)
            {
                 System.out.println("The number is an armstrong number");
            }
            else
            {
                
                System.out.println("The number is not an armstrong number");
            }             
            break;
            case (2):
            System.out.println("Input a number");
            b=sc.nextInt();
            fibo(b);
            break;
            case (3):
            System.out.println("Input a number");
            c=sc.nextInt();
            pell(c);
            break;
            default:System.out.println("Choice not valid");
        }
        
    }
    boolean isarmstrong(int a)
    {
	    int r,i,cube=0;
	    i=a;
	    while (i>0)
	    {
	        r=i%10;
	        i=i/10;
	        cube =cube+r*r*r;
	    }
	    if (cube==a)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
	void fibo(int b)
	{
	    int x=0,y=1,z,i;
	    for (i=1;i<=b;i++)
	    {
	        System.out.print(x+",");
	        z=x+y;
	        x=y;
	        y=z;
	    }
	}
	void pell(int c)
	{
	    int x=0,y=1,z,i;
	    for (i=1;i<=c;i++)
	    {
	        System.out.print(x+",");
	        z=x*x+y;
	        x=y;
	        y=z;
	    }
    }
}
	