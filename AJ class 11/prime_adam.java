/**
 * PRIME ADAM
 * ADAM NUMBER IS A NUMBER WHOSE SQUARE OF ITSELF AND ITS REVERSE ARE REVERSES OF EACH OTHER
 */
import java.util.Scanner;
class prime_adam
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        boolean p,q;
        System.out.println("Input a number");
        n=sc.nextInt();
        isprime(n);
        isadam(n);
        p=isprime(n);
        q=isadam(n);
        if(p==true && q==true)
        {
            System.out.println(n+" is a prime adam number");
        }
    }
    boolean isprime(int n)
    {
        int i,c=0,copy=0;
        copy=n;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c!=1)
        {
            System.out.println("Not a prime adam number");
            System.exit(0);
        }
        return true;
    }
    boolean isadam(int n)
    {
        int copy2=0,r,rev=0,rev2=0,revsq,sq;
        copy2=n;
        while(copy2>0)
        {
            r=copy2%10;
            copy2=copy2/10;
            rev=rev*10+r;
        }
        revsq=rev*rev;
        sq=n*n;
        while(revsq>0)
        {
            r=revsq%10;
            revsq=revsq/10;
            rev2=rev2*10+r;
        }
        if(rev2!=sq)
        {
            System.out.println("Not a prime adam number");
            System.exit(0);
        }
        return true;
    }
    static void main()
    {
        prime_adam ob=new prime_adam();
        ob.input();
    }
}