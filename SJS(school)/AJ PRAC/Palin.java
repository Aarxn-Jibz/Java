import java.util.Scanner;
class Palin
{
    int num,revnum;
    Palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }
    void check()
    {
        int cpy=num;
        int a=reverse(cpy);
        if(a==num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Nope");
        }
    }
    int reverse(int y)
    {
        if(y>0)
        {
            return y%10*10+reverse(y/10);
        }
        return 0;
    }
    void main()
    {
        Palin ob=new Palin();
        ob.accept();
        ob.check();
    }
}