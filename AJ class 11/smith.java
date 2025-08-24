import java.util.Scanner;
class smith
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,copy,r,sum=0,sum2=0,c,c1=0;
        System.out.println("Input number");
        n=sc.nextInt();
        copy=n;
        while(copy>0)
        {
            r=copy%10;
            copy=copy/10;
            sum=sum+r;
        }
        int ar[]=new int[999];
        for(i=2;i<n;i++)
        {
            c=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==1)
            {
                ar[c1]=i;
                c1++;
            }
        }
        for(i=0;i<c1;i++)
        {
            if(n%ar[i]==0)
            {
                if(ar[i]>9)
                {
                    copy=ar[i];
                    while(copy>0)
                    {
                        r=copy%10;
                        copy=copy/10;
                        sum2=sum2+r;
                    }
                }
                else
                {
                    sum2=sum2+ar[i];
                }
                n=n/ar[i];
                i=0;
            }
        }
        if(sum==sum2)
        {
            System.out.println("THE INPUTTED NUMBER IS A SMITH NUMBER");
        }
        else
        {
            System.out.println("Not a smith number");
        }
    }
}