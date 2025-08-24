import java.util.Scanner;
class Stepping_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int l,u,i,j,copy,r,sum=0,c=0,c1=0;
        System.out.println("Input lower bound:");
        l=sc.nextInt();
        System.out.println("Input upper bound:");
        u=sc.nextInt();
        for(i=l;i<=u;i++)
        {
            if(i>=0 &&  i<=9)
            {
                System.out.println(i);
                c++;
            }
            else
            {
                int ar[]=new int[10];
                c1=0;
                sum=0;
                copy=i;
                while(copy>0)
                {
                    r=copy%10;
                    copy=copy/10;
                    ar[c1]=r;
                    c1++;
                }
                for(j=0;j<c1-1;j++)
                {
                    sum=sum+Math.abs(ar[j+1]-ar[j]);
                }
                if(sum==c1-1)
                {
                    System.out.println(i);
                    c++;
                }
            }
        }
        System.out.println("Total number of stepping number:"+c);
    }
}