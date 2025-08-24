import java.util.Scanner;
class pr8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Input number of rows and columns for square matrix:");
        m=sc.nextInt();
        int ar[][]=new int[m][m];
        System.out.println("Input array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("The new matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j || i==0 || j==0 || (i+j)==(m-1) || i==(m-1) || j==(m-1))
                {
                    System.out.print(ar[i][j]+"\t");
                }
                else
                {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
    }
}