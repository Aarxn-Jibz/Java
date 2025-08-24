import java.util.Scanner;
class tax extends Special
{
    public double process(double x,double y)
    {
        Scanner sc=new Scanner(System.in);
        double net;
        net=x+(x*y/100);
        return net;
    }
}