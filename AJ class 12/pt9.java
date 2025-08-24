import java.util.Scanner;
class pt9
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n=0,cpy,r=0,i,j;boolean x,y,z;
        System.out.println("Input number:");
        m=sc.nextInt();
        cpy=m;
        while(cpy>0)
        {
            r=cpy%10;
            cpy=cpy/10;
            n=n*10+r;
        }
        x=isprime(m);
        y=isprime(n);
        if(x== true && y==true)
        {
            z=ispalin(m,n);
            if(z==true)
            {
                System.out.println("The inputted number is prime paindrome:");
                System.exit(0);
            }
        }
        System.out.println("The inputted number is not prime palindrome");
    }
    boolean ispalin(int m, int n)
    {
        int r=0,x=0,i;
        while(m>0)
        {
            r=m%10;
            m=m/10;
            x=x*10+r;
        }
        if(x==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isprime(int x)
    {
        int i,c=0;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}