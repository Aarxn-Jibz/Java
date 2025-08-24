    import java.util.Scanner;
    class revera
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,n;
            System.out.println("Enter the number of elements");
            n=sc.nextInt();
            int ar[]=new int[n];
            for (i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            int arr[]=new int [n];
            for(i=(n-1);i>-1;i--)
            {
                for(i=0;i<n;i++)
                {
                    arr[i]=ar[i];
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }