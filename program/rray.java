        import java.util.Scanner;
        class rray
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,j,k;
                int ar[]=new int[6];
                int arr[]=new int[4];
                int arra[]=new int[10];
                System.out.println("Enter 6 elements of the 1st array");
                for(i=0;i<6;i++)
                {
                    ar[i]=sc.nextInt();
                }
                System.out.println("Enter 4 elemnts of the 2nd array");
                for(j=0;j<4;j++)
                {
                    arr[j]=sc.nextInt();
                }
                for(i=0,k=0;i<6;i++,k++)
                {
                    arra[k]=ar[i];
                }
                for(j=0,k=6;j<4;j++,k++)
                {
                    arra[k]=arr[j];
                }
                for(k=0;k<10;k++)
                {
                    System.out.println(arra[k]);
                }
            }
        }