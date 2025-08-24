    import java.util.Scanner;
    class mart
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,j,floor,shop;
            int ar[][]=new int [5][6];
            int arr[][]=new int [5][6];
            System.out.println("Enter total sales(in units)");
            for(i=0;i<5;i++)
            {
                for(j=0;j<6;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter days earnings");
            for(i=0;i<5;i++)
            {
                for(j=0;j<6;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter Floor number:");
            floor=sc.nextInt();
            System.out.println("Enter Shop number:");
            shop=sc.nextInt();
            System.out.println("The number of units sold today by the shop is:"+ar[floor][shop]);
            System.out.println("The amount of money earned today by the  shop is:"+arr[floor][shop]);
        }
    }