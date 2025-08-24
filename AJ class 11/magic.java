import java.util.Scanner;
class magic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,c=0,c1=0,sum=0,sum2=0,sum3=0,r,copy,copy2,copy3;
        System.out.println("INPUT LOWER BOUND");
        m=sc.nextInt();
        System.out.println("INPUT UPPER BOUND");
        n=sc.nextInt();
        int ar[]=new int[n];
        if(m>n)
        {
            System.out.println("WRONG INPUT");
            System.exit(0);
        }
        for(i=m;i<=n;i++)
        {
            c=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c>1)
            {
                ar[c1]=i;
                c1++;
            }
        }
        System.out.println("The composite magic numbers between the above range is:");
        for(i=0;i<c1;i++)
        {
            copy=i;
            sum=0;
            sum2=0;
            sum3=0;
            while(copy>0)
            {
                r=copy%10;
                copy=copy/10;
                sum=sum+r;
            }
            copy2=sum;
            while(copy2>0)
            {
                r=copy2%10;
                copy2=copy2/10;
                sum2=sum2+r;
            }
            copy3=sum2;
            while(copy3>0)
            {
                r=copy3%10;
                copy3=copy3/10;
                sum3=sum3+r;
            }
            if(sum3==1)
            {
                System.out.println(i);
            }
        }
    }
}