    import java.util.Scanner;
    class pripalcw27June
    {
        public static void main()
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            n=sc.nextInt();
            pripalcw27June ob=new pripalcw27June();
            if(ob.isprime(n)==true && ob.ispalin(n)==true)
            {
                System.out.println("The number is a prime palindrome number");
            }
            else
            {
                System.out.println("The number is not a prime palindrome number");
            }
        }
        boolean isprime(int n)
        {
            int i,c=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        boolean ispalin(int n)
        {
            int copy,r,pal=0;
            copy=n;
            while(copy>0)
            {
            r=copy%10;
            copy=copy/10;
            pal=pal*10+r;
            }
            if(pal==n)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }