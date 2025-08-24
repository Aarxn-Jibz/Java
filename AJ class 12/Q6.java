import java.util.Scanner;
class Q6
{
    int num;
    Q6()
    {
        num=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number:");
        num=sc.nextInt();
    }
    int SumDigits(int x)
    {
        if(x>0)
        {
            int rem=x%10;
            return rem+SumDigits(x/10);
        }
        else
        {
            return 0;
        }
    }
    void isDude()
    {
        int cpy=num;
        int a=SumDigits(num);
        if(Math.pow(a,3)==cpy)
        {
            System.out.println("DUDENEY");
        }
        else
        {
            System.out.println("NOT DUDENEY");
        }
    }
    void main()
    {
        Q6 ob=new Q6();
        ob.input();
        ob.isDude();
    }
}