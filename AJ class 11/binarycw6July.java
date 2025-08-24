    import java.util.Scanner;
    class binarycw6July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int r,n;String s="";
            System.out.println("Enter decimal number");
            n=sc.nextInt();
            while(n>0)
            {
                r=n%2;
                n=n/2;
                s=r+s;
            }
            System.out.println(s);
        }
    }