import java.util.Scanner;
class greatest_common_divisor
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Input 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Wrong input");
            System.exit(0);
        }
        else
        {
            c=getgcd(a,b);
        }
        System.out.println(c);
    }
    int getgcd(int x,int y)
    {
        if(x!=y)
        {
                if(x>y)
                {
                    x-=y;
                }
                else
                {
                    y-=x;
                }
                return getgcd(x,y);
        }
        return x;
    }
}