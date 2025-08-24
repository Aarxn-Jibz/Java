    import java.util.Scanner;
    class ar
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,n;
            System.out.println("Enter number of elements");
            n=sc.nextInt();
            int ar[]=new int[n];
            System.out.println("Enter numbers");
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
                ar[i]=2*ar[i];
            }
            for(i=0;i<n;i++)
            {
                System.out.println(ar[i]);
            }
        }
    }