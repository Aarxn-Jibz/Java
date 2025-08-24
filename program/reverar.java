        import java.util.Scanner;
        class reverar
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,n,a;char ch;
                System.out.println("Enter number of terms");
                n=sc.nextInt();
                char ar[]=new char[n];
                System.out.println("Enter terms");
                for(i=0;i<n;i++)
                {
                    ar[i]=sc.next().charAt(0);
                }
                a=n-1;
                for(i=a;i>=0;i--)
                {
                    System.out.println(ar[i]);
                }
            }
        }