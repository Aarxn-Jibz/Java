import java.util.Scanner;
class matrix_image
{
    int ar[][];int m,n;
    matrix_image(int x,int y)
    {
        m=x;
        n=y;
        ar=new int[m][n];
    }
    void getmat()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
    }
    void mirror_image(matrix_image ob)
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][n-1-j]=ob.ar[i][j];
            }
        }
    }
    void show()
    {
        int i,j;
        System.out.println("The matrix is:"); 
        for(i=0;i<m;i++)
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
        }
    }
    public static void main()
    {
        matrix_image ob=new matrix_image(3,2);
        matrix_image ob2=new matrix_image(3,2);
        ob.getmat();
        ob2.mirror_image(ob);
        ob.show();
        ob2.show();
    }
}