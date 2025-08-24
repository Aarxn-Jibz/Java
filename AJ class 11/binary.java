/**
 * binary search
 */

import java.util.*;
class binary
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,lb,ub,mid,s,flag=0;
        System.out.println("Enetr the limit");
        n=sc.nextInt();
        int ar[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element in sorted order");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be search");
        s=sc.nextInt();
        // considering ascending order
        lb=0;
        ub=n-1;
        while(lb<=ub)
        {
           mid=(lb+ub)/2;
           if(s>ar[mid])
            lb=mid+1;
           else if(s<ar[mid])
            ub=mid-1;
           else
           {
               System.out.println("The number exists at "+mid);
               flag=1;
               break;
           }
        }
        if(flag==0)
            System.out.println("The number doesn't exists");
    }
}