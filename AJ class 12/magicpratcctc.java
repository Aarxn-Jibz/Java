import java.util.Scanner;
class magicpratcctc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int lb,ub,sum=0,i,j,cpy,copy=0,c=0,r;
        System.out.println("Enter lower bound:");
        lb=sc.nextInt();
        System.out.println("Enter upper bound:");
        ub=sc.nextInt();
        for(i=lb;i<=ub;i++)
        {
            cpy=i;
            while(cpy>9)
            {
                sum=0;
                while(cpy>0)
                { 
                    r=cpy%10;
                    cpy=cpy/10;
                    sum=sum+r;
                }
                cpy=sum;
            }
            if(cpy==1)
            {
                System.out.println(i);
                c++;
                continue;
            }
        }
        System.out.println("Number of magic numbers are:"+c);
    }
}