/**
 * triangular number
 * n=15
 * output:
 * 1+2+3+4+5=15
 * 4+5+6=15
 * 7+8=15
 */
import java.util.Scanner;
class pract2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k,sum,l;
        System.out.println("Input nnumber:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=0;
            for(j=i;sum<n;j++)
            {
                sum+=j;
            }
            if(sum==n)
            {
                for(k=i;k<j;k++)
                {
                    System.out.print(k+"+");
                }
                System.out.println("="+sum);
            }
        }
    }
}