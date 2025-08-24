import java.util.Scanner;
class keith
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,r,rev=0,copy=0,sum=0;
        System.out.println("Input number");
        n=sc.nextInt();
        copy=n;
        int ar[]=new int[999];
        while(copy>0)
        {
            r=copy%10;
            copy=copy/10;
            rev=(rev*10)+r;
        }
        System.out.println(rev);
        while(rev>0)
        {
            r=rev%10;
            rev=rev/10;
            ar[c]=r;
            c++;
        }
        for(i=c;i<n;i++)
        {
            if(sum>=n)
            {
                break;
            }
            sum=0;
            for(j=i-1;j>=i-c;j--)
            {
                sum=sum+ar[j];
            }
            ar[i]=sum;
        }
        for(j=0;j<i;j++)
        {
            System.out.print(ar[j]+",");
        }
        System.out.println();
        if(sum==n)
        {
            System.out.println("The given number is a Keith number");
        }
        else
        {
            System.out.println("The inputted number is not a Keith number");
        }
    }
}