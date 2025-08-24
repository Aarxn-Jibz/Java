/**
 * WAP to check whether numbers are unique or not.
 * A number is unique if it dosent contain or repeating numbers.
 */
import java.util.Scanner;
class unique
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,copy,i,l=0;String s="";
        System.out.println("Enter number to be inputted");
        n=sc.nextInt();
        copy=n;
        while(copy>0)
        {
            r=copy%10;
            copy=copy/10;
            if(r==0)
            {
                System.out.println("Not a unique number");
                System.exit(0);
            }
        }
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=Integer.toString(n);
            char a=(char)r;
            for(i=0;i<s.length();i++)
            {
                if(a==s.charAt(i))
                {
                    System.out.println("Not a unique number");
                    System.exit(0);
                }
            }
        }
        System.out.println("The number is a unique number");
    }
}