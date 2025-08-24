/**
 * while(x%y!=0)
 *{
 *	r=x%y;
 *	x=y;
 *	y=r;
 *}
 *print(y);
 *int gcd(int,int)
 */
import java.util.Scanner;
class tuti
{
    void main()
    {
        int x,y,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 2 numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        c=gcd(x,y);
        System.out.println(c);
    }
    int gcd(int x,int y)
    {
        int r;
        if(x%y!=0)
        {
            r=x%y;
            x=y;
            y=r;
            return gcd(x,y);
        }
        return y;
    }
}