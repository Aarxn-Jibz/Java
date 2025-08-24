/**
 * Given an array containing N integers and an integer K.
 * Your task is to find  a 3 long Sub-Array with the sum of the elements equal to the given value K.
 */
import java.util.Scanner;
class K
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,k,i,j,l;
        System.out.println("Input n");
        n=sc.nextInt();
        System.out.println("Input k");
        k=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Input array elements:");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Input k");
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(l=0;l<n;l++)
                {
                    if(ar[i]+ar[j]+ar[l]==k)
                    {
                        System.out.println(i+","+j+","+l);
                    }
                }
            }
        }
    }
}