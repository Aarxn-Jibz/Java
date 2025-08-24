/**
 * declare mxn matrix and fill all corner blocks with '#'
 * and fill all rest border blocks with '@' and fill rest of blocks with '?'
 */
import java.util.Scanner;
class pract
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Input number of rows:");
        m=sc.nextInt();
        System.out.println("The number of columns:");
        n=sc.nextInt();
        char ar[][]=new char[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || i==(m-1) || j==0 || j==(n-1))
                {
                    if((i==0 && (j==0 || j==(n-1))) || i==(m-1) && (j==0 || j==(n-1)))
                    {
                        ar[i][j]='#';
                    }
                    else
                    {
                        ar[i][j]='@';
                    }
                }
                else
                {
                    ar[i][j]='?';
                }
            }
        }
        System.out.println("The matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
}