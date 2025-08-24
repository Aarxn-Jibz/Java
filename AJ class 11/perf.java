import java.util.Scanner;
class perf
{
    static int getsum(int a,int i)
    {
        if(i==a)
        {
            return 0;
        }
        else
        {
            if(a%i==0)
            {
                return i+getsum(a,i+1);
            }
            else
            {
                return getsum(a,i+1);
            }
        }
    }
}