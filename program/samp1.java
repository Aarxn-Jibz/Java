        import java.util.Scanner;
        class samp1
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,n,search,flag=0;
                System.out.println("Enter number of terms");
                n=sc.nextInt();
                int ar[]=new int[n];
                System.out.println("Enter terms");
                for(i=0;i<n;i++)
                {
                    ar[i]=sc.nextInt();
                }
                System.out.println("Enter element to be searched");
                search=sc.nextInt();
                for(i=0;i<n;i++)
                {
                    if(search==ar[i])
                    {
                        System.out.println(i);
                    }
                }
            }
        }