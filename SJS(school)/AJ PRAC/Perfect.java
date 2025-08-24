import java.util.Scanner;
class Perfect
{
    int num;
    Perfect(int nn)
    {
        num=nn;
    }
    int sum_of_digits(int i)
    {
        if(i<num)
        {
            if(num%i==0)
            {
                return i+sum_of_digits(i++);
            }
            else
            {
                return sum_of_digits(i++);
            }
        }
        return 0;
    }
    void check()
    {
        int c=1;
        int a=sum_of_digits(c);
        if(a==num)
        {
            System.out.println("PERFECT!");
        }
        else
        {
            System.out.println("NOPE");
        }
    }
}