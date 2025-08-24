import java.util.Scanner;
    class matrix_transpose
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int m,n,i,j;
            System.out.println("Input m");
            m=sc.nextInt();
            System.out.println("Input n");
            n=sc.nextInt();
            int ar[][]=new int[m][n];
            int arr[][]=new int[n][m];
            System.out.println("Input matrix elements");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            for(j=0;j<n;j++)
            {
                for(i=0;i<m;i++)
                {
                    arr[j][i]=ar[i][j];
                }
            }
            System.out.println("The original matrix is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<n;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            System.out.println("");
            System.out.println("The matrix transpose is:");
            for(i=0;i<n;i++)
            {
                System.out.println("");
                for(j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }