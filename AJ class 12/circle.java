import java.util.Scanner;
class circle extends shape implements box
{
    double r,pi=3.14,area=0.0;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius:");
        r=sc.nextDouble();
    }
    public void output()
    {
        System.out.println("The area of the circle is: "+area);
    }
    public void calculate()
    {
        area=pi*r*r;
    }
}