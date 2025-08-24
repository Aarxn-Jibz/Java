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
        System.out.println("Input number:");
        num=sc.nextInt();
    }
    int SumDigits(int x)
    {
        if(x>0)
        {
            return x%10+SumDigits(x/10);
        }
        return 0;
    }
    void isDude()
    {
        int cpy=num;
        int a=SumDigits(cpy);
        if(Math.pow(a,3)==num)
        {
            System.out.println("Dudeney");
        }
        else
        {
            System.out.println("Not dudeney");
        }
    }
    void main()
    {
        NumDude ob=new NumDude();
        ob.input();
        ob.isDude();
    }
}