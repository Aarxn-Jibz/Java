    import java.util.Scanner;
    class arr
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,n;
            System.out.println("Enter number of elements required");
            n=sc.nextInt();
            int ar[]=new int[n];
            System.out.println("Enter the numbers");
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