/**
 * transpose matrix
 */
import java.util.Scanner;
class trans
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j,k;
        System.out.println("Input m");
        m=sc.nextInt();
        int ar[][]=new int[m][m];
        System.out.println("Input elements of matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix is:");
        for(i=0;i<m;i++)
        {
            System.out.println();
            for(j=0;j<m;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
        }
        int arr[][]=new int[m][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=ar[j][i];
            }
        }
        System.out.println();
        System.out.println("The transpose matrix is:");
        for(i=0;i<m;i++)
        {
            System.out.println();
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
        }
    }
}