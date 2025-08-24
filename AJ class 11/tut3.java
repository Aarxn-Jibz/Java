/**
 * 0,1,1,2,3,5,8,.. N TERMS

    f(n)=f(n-1)+f(n-2)		where, f(1)=0 and f(2)=1
    f(5)=f(4)+f(3)
    =f(3)+f(2)+f(2)+f(1)
    =f(2)+f(1)+1+1+0
    =1+0+1+1+0=3
    int fibo(int): it returns the value of nth term
 */
import java.util.Scanner;
class tut3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,a;
        System.out.println("Input term");
        x=sc.nextInt();
        a=fibo(x);
        System.out.println(a);
    }
    int fibo(int x)
    {
        if(x==1)
        {
            return 0;
        }
        else if(x==2)
        {
            return 1;
        }
        else
        {
            return fibo(x-1)+fibo(x-2);
        }
    }
}