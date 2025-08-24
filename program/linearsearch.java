/**
 * linear search:
 * 1) accept N number of elements in int array and also accept
 *    a single value from the user to that the value is
 *    present in the array or not.
 * 
 * 2) accept N number of elements in int array and also accept
 *    a single value from the user to display its frequency.
 */

import java.util.*;
class linearsearch
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s;
        System.out.println("Enetr the limit");
        n=sc.nextInt();
        int ar[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be search");
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(ar[i]==s)
                c++;
        }
        if(c>0)
            System.out.println("The number exists "+c+" times");
        else 
            System.out.println("The number doesn't exists");
    }
}