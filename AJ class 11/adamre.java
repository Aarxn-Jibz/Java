/**
 * PRIME ADAM
 * ADAM NUMBER IS A NUMBER WHOSE SQUARE OF ITSELF AND ITS REVERSE ARE REVERSES OF EACH OTHER
 */
import java.util.Scanner;
class adamre
{
    int a=0;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,rev,nsq,revsq,ch;
        System.out.println("Input number");
        n=sc.nextInt();
        rev=reve(n);
        nsq=sq(n);
        revsq=sq(rev);
        a=0;
        ch=reve(revsq);
        if(ch==nsq)
        {
            System.out.println("Adam number");
        }
        else
        {
            System.out.println("Not adam");
        }
    }
    int reve(int n)
    {
        int r;
        if (n==0)
        {
            return a;
        }
        r=n%10;
        a=a*10+r;
        n=n/10;
        return reve(n);
    }
    int sq(int n)
    {
        int a;
        a=n*n;
        return a;
    }
}