    import java.util.Scanner;
    class matran
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int lds=0,rds=0,diff=0,i,j;
            int ar[][]=new int[4][4];
            System.out.println("Enter array elements");
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            System.out.println("The left diagonal is:");
            for(i=0;i<4;i++)
            {
                System.out.println();
                for(j=0;j<4;j++)
                {
                    if(i==j)
                    {
                        System.out.print(ar[i][j]+"\t");
                        lds=lds+ar[i][j];
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
            System.out.println("The sum of the left-diagonal elements is:"+lds);
            System.out.println("The right diagonal is:");
            for(i=0;i<4;i++)
            {
                System.out.println();
                for(j=0;j<4;j++)
                {
                    if(i+j==3)
                    {
                        System.out.print(ar[i][j]+"\t");
                        rds=rds+ar[i][j];
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
            System.out.println("The sum of right-diagonal elements is:"+rds);
            diff=lds-rds;
            System.out.println("The difference between sum of left and right diagonals are:"+diff);
        }
    }