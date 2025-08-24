/**
 * Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
 * Note: can you take care of the duplicates without using any additional Data Structure?
 * Example 1:
 * Input:
 * n1 = 6; A = {1, 5, 10, 20, 40, 80}
 * n2 = 5; B = {6, 7, 20, 80, 100}
 * n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
 * Output: 20 80
 * Explanation: 20 and 80 are the only common elements in A, B and C.
 */
import java.util.Scanner;
class GFG3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,n4,a=0,i,j,k,c=0;
        System.out.println("Input size of array 1");
        n1=sc.nextInt();
        System.out.println("Input size of array 2");
        n2=sc.nextInt();
        System.out.println("Input size of array 3");
        n3=sc.nextInt();
        int ar[]=new int[n1];
        int arr[]=new int[n2];
        int arra[]=new int[n3];
        if(n1>n2)
        {
            a=n1;
            if(n3>a)
            {
                a=n3;
            }
        }
        else
        {
            a=n2;
            if(n3>a)
            {
                a=n3;
            }
        }
        int array[]=new int[a];
        System.out.println("Input elements of 1st array");
        for(i=0;i<n1;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Input elements of 2nd array");
        for(i=0;i<n2;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Input elements of 3rd array");
        for(i=0;i<n3;i++)
        {
            arra[i]=sc.nextInt();
        }
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++)
            {
                for(k=0;k<n3;k++)
                {
                    if(ar[i]==arr[j] && arr[j]==arra[k])
                    {
                        array[c]=ar[i];
                        c++;
                    }
                }
            }
        }
        for(i=0;i<c;i++)
        {
            System.out.println(array[i]);
        }
    }
}