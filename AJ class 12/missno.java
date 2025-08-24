import java.util.Scanner;
class missno
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c,c1=0;
        System.out.println("Input size:");
        n=sc.nextInt();
        System.out.println("Enter all numbers from 1 to the inputted number barring any one number:");
        int ar[]=new int[n];
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=1;i<n+1;i++)
        {
            c=i;
            c1=0;
            for(j=0;j<n;j++)
            {
                if(ar[j]==c)
                {
                    c1++;
                }
            }
            if(c1==0)
            {
                System.out.println("Missing number is:"+i);
                System.exit(0);
            }
        }
    }
}