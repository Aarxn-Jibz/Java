    import java.util.Scanner;
    class factorsum
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,n,sum=0;
            System.out.println("Enter");
            n=sc.nextInt();
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
            System.out.println(sum);
        }
    }