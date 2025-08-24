/**
 * Insertion Sort:
 * 
 * 45,65,55,75,25,35
 * 
 * 45,55,65,75,25,35
 * 25,45,55,65,75,35
 * 25,35,45,55,65,75
 */

import java.util.*;
class insertion_sort
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k,p;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        int ar[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        }
        // insertion sort
        for(i=1;i<n;i++)
        {
            k=ar[i];
            p=i;
            while(p>0 && k<ar[p-1])
            {
                ar[p]=ar[p-1];
                p--;
            }
            ar[p]=k;
        }
         for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+"\t");
        }
    }
}