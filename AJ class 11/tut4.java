/**
 * int bsearch(int ar[],int lb,int ub,int s) it will return the index number if the elemnt found, otherwise return -1
 */
import java.util.Scanner;
class tut4
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int lb=0,ub,n,i,s,c;
        System.out.println("Input size of the array");
        n=sc.nextInt();
        int ar[]=new int[n];
        ub=n-1;
        System.out.println("Input array elements");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Input element to be searched");
        s=sc.nextInt();
        c=bsearch(ar,lb,ub,s);
        if(c==-1)
        {
             System.out.println("Term not found");
        }
        else
        {
            System.out.println("Found at "+c);
        }
    }
    int bsearch(int ar[],int lb,int ub,int s)
    {
        int mid;
        if(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(s>ar[mid])
            {
                lb=mid+1;
                return bsearch(ar,lb,ub,s);
            }
            else if(s<ar[mid])
            {
                ub=mid-1;
                return bsearch(ar,lb,ub,s);
            }
            else
            {
                return mid;
            }
        }
        else
        {
            return -1;
        }
    }
}