/**
 * The following are the ways of finding n raise to the power m.
 * Example 1. let n=2 and m=0, n
 * m=20=1 Example 2. let n=2 and m=3, n
 * m=23=8
 * Example 1. let n=2 and m= -3, n
 * m=2-3=0.125
 * A class poweris declared with the following details:
 * Class name : poweris
 * Data Members :
 * N : to store an integer number.
 * M : to store power value.
 * P : to store ‘n’ raise to the power ‘m’(double type)
 * Member methods :
 * Poweris() : a constructor to initialize 0 to m and n
 * int power(int n,int m): to find and return ‘n’ raise to the power ‘m’ using above 
 * conditions given in the examples. Use recursive technique.
 * Void findresult() : to accept n and m from the user and calculate the value of n 
 * Raise to the power m using power().
 * Void printresult() : print the value of p
 */
import java.util.Scanner;
class poweris
{
    int m,n;double p;
    poweris()
    {
        m=0;
        n=0;
        p=1.0;
    }
    void findresult()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input n:");
        n=sc.nextInt();
        System.out.println("Input m:");
        m=sc.nextInt();
        power(n,m);
    }
    int power(int n,int m)
    {
        if(m>0)
        {
            p=p*n;
            return n*power(n,--m);
        }
        else if(m<0)
        {
            p=p*(double)(1/n);
            return (1/n)*power(n,++m);
        }
        else
        {
            return 1;
        }
    }
    void printresult()
    {
        System.out.println(p);
    }
    void main()
    {
        poweris ob=new poweris();
        ob.findresult();
        ob.printresult();
    }
}