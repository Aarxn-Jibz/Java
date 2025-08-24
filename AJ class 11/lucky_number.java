import java.util.Scanner;
class lucky_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,dif,u,l,c=0,count=0,step=2;
        System.out.println("Input lower bound");
        l=sc.nextInt();
        System.out.println("Input upper bound");
        u=sc.nextInt();
        dif=u-l;
        int ar[]=new int[dif];
        for(i=l;i<u;i++)
        {
            ar[c]=i;
            c++;
        }
        for(step=2;step<dif/2;step++)
        {
            count=0;
            for(i=0;i<dif;i++)
            {
                if(ar[i]!=0)
                {
                    count++;
                }
                if(count%step==0)
                {
                    ar[i]=0;
                }
            }
        }
        for(i=0;i<dif;i++)
        {
            if(ar[i]!=0)
            {
                System.out.print(ar[i]+" ");
            }
        }
        System.out.println();
    }
}