import java.util.Scanner;
class rectangle extends shape implements box
{
    double l,b,area=0.0;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length:");
        l=sc.nextDouble();
        System.out.println("Input breadth:");
        b=sc.nextDouble();
    }
    public void output()
    {
        System.out.println("The area of the rectangle is: "+area);
    }
    public void calculate()
    {
        area=l*b;
    }
}
