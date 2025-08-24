    import java.util.Scanner;
    class higlowmat
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int m,n,i,j,high=-99999,low=99999;
            System.out.println("Input m");
            m=sc.nextInt();
            System.out.println("Input n");
            n=sc.nextInt();
           int ar[][]=new int[m][n];
           System.out.println("Inout elements");
           for(i=0;i<m;i++)
           {
               for (j=0;j<n;j++)
               {
                    ar[i][j]=sc.nextInt();
               }
           }
           for(i=0;i<m;i++)
           {
               for(j=0;j<n;j++)
               {
                   if(low>ar[i][j])
                   {
                       low=ar[i][j];
                   }
                   else if(high<ar[i][j])
                   {
                       high=ar[i][j];
                   }
               }
           }
           System.out.println("The lowest value in the matrix is:"+low);
           System.out.println("The highest value in the matrix is:"+high);
        }
    }