    import java.util.Scanner;
    class pattern2hw20July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int m,z,i,j;
            System.out.println("Enter number of elements");
            m=sc.nextInt();
            int ar[][]=new int[m][m];
            System.out.println("Input elements of array");
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
                System.out.println("");
                for(j=0;j<m;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            System.out.println("");
            System.out.println("The top-left right angled triangle is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<m;j++)
                {
                    if(i+j<=m-1)
                    {
                        System.out.print(ar[i][j]+"\t");
                    }
                }
            }
            System.out.println("");
            System.out.println("The top-right right angled triangle is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<m;j++)
                {
                    if(j>=i)
                    {
                        System.out.print(ar[i][j]+"\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
            }
        }
    }