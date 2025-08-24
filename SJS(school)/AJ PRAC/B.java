import java.util.Scanner;
class B
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k;
        System.out.println("M=");
        m=sc.nextInt();
        System.out.println("N=");
        n=sc.nextInt();
        int ar[][]=new int[m][n];
        int a[][]=new int[m][n];
        System.out.println("Input matrix A");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix B");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(ar[i][j]!=a[i][j])
                {
                    System.out.println("NOT EQUAL");
                    System.exit(0);
                }
            }
        }
        System.out.println("EQUAL");
    }
}