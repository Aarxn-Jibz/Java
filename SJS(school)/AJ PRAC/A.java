import java.util.Scanner;
class A
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k;
        System.out.println("M=");
        m=sc.nextInt();
        System.out.println("N=");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Input matrix elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("OG MATRIX:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                k=numrev(a[i][j]);
                a[i][j]=k;
            }
        }
        System.out.println("NEW MATRIX:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    int numrev(int x)
    {
        int r,rev=0;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            rev=rev*10+r;
        }
        return rev;
    }
}