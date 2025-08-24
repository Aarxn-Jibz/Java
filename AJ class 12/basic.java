/**
 *     find sum of series 1+2+3+...
 */
import java.util.Scanner;
class basic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Input n");
        n=sc.nextInt();
        for(i=0;i<n+1;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}