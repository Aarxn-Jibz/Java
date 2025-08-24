import java.util.Scanner;
class C
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n,k,c2=0;
        System.out.println("M=");
        m=sc.nextInt();
        System.out.println("N=");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        if (m<3 || m>9 || n<3 || n>9)
        {
            System.out.println("INVALID INPU");
            System.exit(0);
        }
        System.out.println("Enter elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int ar[][]=new int[n][m];
        System.out.println("OG MATRIX");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(j=0;j<n;j++)
        {
            for(i=0;i<m;i++)
            {
                ar[j][i]=a[i][j];
            }
        }
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            int c=m-1;
            for(j=0;j<m;j++)
            {
               arr[i][j]=ar[i][c--]; 
            }
        }
        System.out.println("New matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
                if(arr[i][j]%2!=0)
                {
                    c2=c2+arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of odd elements is:"+c2);
    }
}