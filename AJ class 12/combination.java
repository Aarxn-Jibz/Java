/**
 * class name : combination
 * data member: n,r as integer
 * member methods:
 *                  binomial()
 *                  void input(): to accept n and r
 *                  void display() : to display the nCr value
 *                  int fact(int): using recursive it will return the factorial of recieved number
 */
import java.util.Scanner;
class combination
{
    int n,r;
    public static void main()
    {
        combination ob=new combination();
        ob.input();
        ob.display();
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input n:");
        n=sc.nextInt();
        System.out.println("Input r:");
        r=sc.nextInt();
    }
    int fact(int a)
    {
        if(a!=0)
        {
            return a*fact(--a);
        }
        return 1;
    }
    void display()
    {
        int a,b,c,so;
        a=fact(n);
        b=fact(r);
        c=fact(n-r);
        so=a/(b*c);
        System.out.println("The binomial is:"+so);
    }
}