/**
 * Input: Mat[3][3] = { {1, 2, 3},
 * {4, 5, 6},
 * {7, 8, 9}}
 * Output: 7
 * 7 is minimum in its row and maximum in its column.
 */
import java.util.Scanner;
class pract3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,max=0,min=0,c=0,c1=0,c2=0;
        System.out.println("Input number of rows and columns:");
        m=sc.nextInt();
        int ar[][]=new int[m][m];
        System.out.println("Input matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        int arr[]=new int[m];
        for(i=0;i<m;i++)
        {
            min=ar[i][0];
            for(j=0;j<m-1;j++)
            {
                if(ar[i][j+1]<ar[i][j])
                {
                    min=ar[i][j+1];
                }
            }
            arr[c++]=min;
        }
        int a[]=new int[m];
        for(j=0;j<m;j++)
        {
            max=ar[0][j];
            for(i=0;i<m-1;i++)
            {
                if(ar[i+1][j]>ar[i][j])
                {
                    max=ar[i+1][j];
                }
            }
            a[c1++]=max;
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(arr[i]==a[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}