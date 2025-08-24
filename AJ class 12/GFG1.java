/**
 * You are given an array A of size N. 
 * Let us denote S as the sum of all integers present in the array. 
 * Among all integers present in the array, find the minimum integer X such that S ≤ N*X.
 */
import java.util.Scanner;
class GFG1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,x=0,i;
        System.out.println("Input size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Input numbers");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        for(i=0;i<50;i++)
        {
            if(s<=n*i)
            {
                x=i;
                break;
            }
        }
        System.out.println("The min value is "+x);
    }
}