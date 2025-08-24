import java.util.Scanner;
class unirec
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,j,i=0,r;
        System.out.println("Input number");
        n=sc.nextInt();
        int ar[]=new int[10];
        while(n>0)
        {
            r=n%10;
            n=n/10;
            ar[i]=r;
            i++;
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.println("Not a unique number");
                    System.exit(0);
                }
            }
        }
        System.out.println("Unique number");
    }
}