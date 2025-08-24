/**
 * WAP to check whether numbers are unique or not.
 * Input m and n.m must be lower than n.
 * Find unique number swithin the range.
 * A number is unique if it dosent contain or repeating numbers.
 */
import java.util.Scanner;
class pract7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k,c1;String s;char c;
        System.out.println("Input m:");
        m=sc.nextInt();
        System.out.println("Input n:");
        n=sc.nextInt();
        if(m<n)
        {
            for(i=m;i<=n;i++)
            {
                s=Integer.toString(i);
                c1=0;
                for(j=0;j<s.length();j++)
                {
                    c=s.charAt(j);
                    for(k=0;k<s.length();k++)
                    {
                        if(c==s.charAt(k))
                        {
                            c1++;
                        }
                    }
                }
                if(c1==s.length())
                {
                    System.out.println(s);
                }
            }
        }
    }
}