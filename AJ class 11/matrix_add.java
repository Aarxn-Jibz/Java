    import java.util.Scanner;
    class matrix_add
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
            int arr[][]=new int[m][n];
            int arra[][]=new int[m][n];
            System.out.println("Input element of first matrix");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            System.out.println("Input elements of second matrix");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("The first matrix is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<n;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            System.out.println("");
            System.out.println("The second matrix is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println("");
            System.out.println("The sum of 2 matrices is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<n;j++)
                {
                    System.out.print(ar[i][j]+arr[i][j]+"\t");
                }
            }
        }
    }