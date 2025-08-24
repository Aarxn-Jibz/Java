    import java.util.Scanner;
    class dec2ochw8July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s="";int n,r;
            System.out.println("Enter number in decimal");
            n=sc.nextInt();
            while(n>0)
            {
                r=n%8;
                n=n/8;
                s=r+s;
            }
            System.out.println(s);
        }
    }