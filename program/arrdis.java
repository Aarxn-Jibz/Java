        import java.util.Scanner;
        class arrdis
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,n;
                System.out.println("Enter number of terms to be inputted");
                n=sc.nextInt();
                int ar[]=new int[n];
                System.out.println("Enter terms");
                for(i=0;i<n;i++)
                {
                    ar[i]=sc.nextInt();
                }
                System.out.println("The array is:");
                for(i=0;i<n;i++)
                {
                    System.out.println(ar[i]);
                }
            }
        }