/**
 * WAP to make a double dimensional array and then sort its rows then columns
 */
import java.util.Scanner;
class arraydoublesort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,n,temp;
        System.out.println("Input number of rows:");
        m=sc.nextInt();
        System.out.println("Input number of columns:");
        n=sc.nextInt();
        int ar[][]=new int [m][n];
        System.out.println("Input the elements of the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original array is:");
        for(i=0;i<m;i++)
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
        }
        System.out.println();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<(n-j)-1;k++)
                {
                    if(ar[i][k]>ar[i][k+1])
                    {
                        temp=ar[i][k];
                        ar[i][k]=ar[i][k+1];
                        ar[i][k+1]=temp;
                    }
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                for(k=0;k<(m-j)-1;k++)
                {
                    if(ar[k][i]>ar[k+1][i])
                    {
                        temp=ar[k][i];
                        ar[k][i]=ar[k+1][i];
                        ar[k+1][i]=temp;
                    }
                }
            }
        }
        System.out.println("The sorted array is:");
        for(i=0;i<m;i++)
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
        }
    }
}