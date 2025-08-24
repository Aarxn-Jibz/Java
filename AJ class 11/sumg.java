import java.util.Scanner;
class sumg
{
    int sum=0;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        System.out.println("Input number");
        n=sc.nextInt();
        a=getsum(n);
        System.out.println(a);
    }
    int getsum(int n)
    {
        int r;
        if(n==0)
        {
            return sum;
        }
        r=n%10;
        n=n/10;
        sum=sum+r;
        return getsum(n);
    }
}