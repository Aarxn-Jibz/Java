    import java.util.Scanner;
    class patterncw20July
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
            System.out.println("The bottom-left right angled triangle is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<=i;j++)
                {
                    System.out.print(ar[i][j]+"\t");
                }
            }
            System.out.println("");
            System.out.println("The bottom-right right angled triangle is:");
            for(i=0;i<m;i++)
            {
                System.out.println("");
                for(j=0;j<m;j++)
                {
                    z=i+j;
                    if(z>=m-1)
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