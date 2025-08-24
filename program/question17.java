import java.util.*;
class question17
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,lb,ub,mid,flag=0;double s;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        double ar[]=new double[n];        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element in sorted order");
            ar[i]=sc.nextDouble();
        }
        System.out.println("Enter the number to be searched");
        s=sc.nextDouble();
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