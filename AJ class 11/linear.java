    import java.util.Scanner;
    class linear
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,n,search;
            System.out.println("Enter limit");
            n=sc.nextInt();
            int ar[]=new int[n];
            System.out.println("Input array elements");
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println("Input elemnt to be searched");
            search=sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(search==ar[i])
                {
                    System.out.println("The number exists at "+i);
                }
            }
        }
    }