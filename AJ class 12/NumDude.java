import java.util.Scanner;
class NumDude
{
    int num;
    NumDude()
    {
        num=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inpit number:");
        num=sc.nextInt();
    }
    int sumDigits(int x)
    {
        if(num>0)
        {
            x=x+num%10;
            num=num/10;
            return sumDigits(x);
        }
        return x;
    }
    void isDude()
    {
        int copy=num;
        int a=sumDigits(0);
        if(Math.pow(a,3)==copy)
        {
            System.out.println("Dudeney number:");
        }
        else
        {
            System.out.println("Hell NAH!");
        }
    }
    void main()
    {
        NumDude ob=new NumDude();
        ob.input();
        ob.isDude();
    }
}