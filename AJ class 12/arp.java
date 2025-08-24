/**
 * Union of two arrays can be defined as the common and distinct elements in the two arrays.
 * Given two sorted arrays of size n and m respectively, find their union.
 * Example 1:
 * Input: 
 * n = 5, arr1[] = {1, 2, 3, 4, 5} 
 * m = 3, arr2 [] = {1, 2, 3}
 * Output: 1 2 3 4 5
 * Explanation: Distinct elements including 
 * both the arrays are: 1 2 3 4 5.
 */
import java.util.Scanner;
class arp
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a,i,j,k,c=0;
        System.out.println("Input size of first array");
        n=sc.nextInt();
        System.out.println("Input size of second array");
        a=sc.nextInt();
        int ar[]=new int[n];
        int arr[]=new int[n];
        System.out.println("Input elements:");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Input elements of the second array:");
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arra[]=new int[n+a];
        for(i=0;i<n+a;i++)
        {
            for(j=0;j<n;j++)
            {
                arra[c]=ar[j];
                c++;
            }
            for(j=0;j<a;j++)
            {
                arra[c]=arr[j];
                c++;
            }
        }
        m=a+n;
        for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                if(arra[i]==arra[c])
                {
                }
            }
        }
    }
}