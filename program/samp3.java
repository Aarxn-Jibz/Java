        import java.util.Scanner;
        class samp3
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,n;
                System.out.println("Enter number");
                n=sc.nextInt();
                int ar[]=new int[n];
                System.out.println("Enter terms");
                for(i=0;i<n;i++)
                {
                    ar[i]=sc.nextInt();
                }
                for(i=0;i<n;i++)
                {
                    System.out.println(ar[i]);
                }
            }
        }