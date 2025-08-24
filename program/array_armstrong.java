/**
 * display all the Armstrong numbers are present in an array of n blocks.Armstrong 
 * number
 * :if sum of the cube of all the digits of a number is equal to that number.
 */
import java.util.Scanner;
class array_armstrong
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,b,n,cube=0,r;
        int a[]=new int[10];
        System.out.println("Input 10 integers");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            while(a[i]>0)
            {
                n=a[i];
                r=a[i]%10;
                a[i]=a[i]/10;
                cube=cube+r*r*r;
                if(n==cube)
                {
                    System.out.println("The number "+n+"is an armstrong number");
                }
            }
        }
    }
}