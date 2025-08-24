import java.util.Scanner;
class cirprime
{
    static Scanner sc=new Scanner(System.in);
    int n,c=0,c1=0,og,r;
    void control()
    {
        System.out.println("Input number:");
        n=sc.nextInt();
        og=n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        n=og;
        checkprime(n);
        while(true)
        {
            while(n>0)
            {
                r=n%(int)Math.pow(10,c-1);
                n=n/(int)Math.pow(10,c-1);
            }
            n=r*10+n;
            if(n==og)
            {
                break;
            }
            checkprime(n);
        }
        if(c1==c)
        {
            System.out.println("The number is a circular prime number");
        }
        else
        {
            System.out.println("The number is not a circular prime number");
        }
    }
    void checkprime(int x)
    {
        int i,c2=0;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                c2++;
            }
        }
        if(c2==1)
        {
            System.out.println(x);
            c1++;
        }
    }
    public static void main()
    {
        cirprime ob=new cirprime();
        ob.control();
    }
}