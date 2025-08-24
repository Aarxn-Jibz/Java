    import java.util.Scanner;
    class array4July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,j,m,n,sum=0;
            System.out.println("Enter no. of columns");
            m=sc.nextInt();
            System.out.println("Enter no.of rows");
            n=sc.nextInt();
            int ar[][]=new int [m][n];
            System.out.println("Enter numbers row wise");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                    sum=sum+ar[i][j];
                }
            }
            System.out.println("Total sum:"+sum);
            for(i=0;i<n;i++)
            {
                sum=0;
                for(j=0;j<n;j++)
                {
                    sum=sum+ar[i][j];
                }
                System.out.println("The sum of row "+(i+1)+" is " +sum);
            }
            for(j=0;j<n;j++)
            {
                sum=0;
                for(i=0;i<n;i++)
                {
                    sum=sum+ar[i][j];
                }
                System.out.println("The sum of columns "+(j+1)+" is " +sum);
            }
        }
    }