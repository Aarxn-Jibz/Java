import java.util.Scanner;
    class matrix_product
    {
        void main()
        {
            Scanner sc=new Scanner(System.in);
            int m,n,o,k,i,j,p=1;
            System.out.println("Enter m");
            m=sc.nextInt();
            System.out.println("Input n");
            n=sc.nextInt();
            System.out.println("Input o");
            o=sc.nextInt();
            int ar[][]=new int[m][n];
            int arr[][]=new int[n][o];
            int a[][]=new int[m][o];
            System.out.println("Input elemnts of first matrix");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            System.out.println("Input elements of the second matrix");
            for(i=0;i<n;i++)
            {
                for(j=0;j<o;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("The first matrix is:");
            for(i=0;i<m;i++)
            {
                System.out.println();
                for(j=0;j<n;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            System.out.println();
            System.out.println("The second matrix is:");
            for(i=0;i<n;i++)
            {
                System.out.println();
                for(j=0;j<o;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
            for(i=0;i<m;i++)
            {
                for(j=0;j<o;j++)
                {
                    for(k=0;k<n;k++)
                    {
                        a[i][j]+=ar[i][o]*arr[o][j];
                    }
                }
            }
            System.out.println("The product is:");
            for(i=0;i<m;i++)
            {
                System.out.println();
                for(j=0;j<o;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
            }
        }
    }