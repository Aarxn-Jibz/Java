    import java.util.Scanner;
    class specialcw24June
    {
        void code()
        {
            Scanner sc=new Scanner(System.in);
            int n,copy=0,r,i,special,product=1;
            System.out.println("Enter a 2 digit number");
            n=sc.nextInt();
            if(n>=9 && n<100)
            {
                System.out.println("The number is a 2 digit number");
            }
            else
            {
                System.out.println("The number is not a 2 digit number");
                System.exit(0);
            }
            copy=n;
            r=copy%10;
            copy=copy/10;
            for(i=1;i<copy;i++)
            {
                product=product*i;
            }
            special=product*r;
            if(special==n)
            {
                System.out.println("The number is a special number");
            }
            else
            {
                System.out.println("The number is not a spevial number");
            }
        }
        public static void main()
        {
            specialcw24June ob=new specialcw24June();
            ob.code();
        }
    }