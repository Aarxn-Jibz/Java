    import java.util.Scanner;
    class proniccw22June
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n,i,o=0,product=0;
            System.out.println("Input a number");
            n=sc.nextInt();
            for(i=0;i<n;i++)
            {
                o=i+1;
                product=i*o;
                {
                    if(product==n)
                    {
                        System.out.println("Pronic number");
                    }
                    else
                    {
                        System.out.println("Not a pronic number");
                    }
                }
            }
        }
    }