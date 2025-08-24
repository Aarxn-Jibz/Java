/**
 * int getpow(int,int)
 */
import java.util.Scanner;
class tuti2
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int z,x,y;
        System.out.println("Input number");
        x=sc.nextInt();
        System.out.println("Input the power");
        y=sc.nextInt();
        z=getpow(x,y);
        System.out.println(z);
    }
    int getpow(int x,int y)
    {
        if(y>0)
        {
            return x*getpow(x,y-1);
        }
        return 1;
    }
}