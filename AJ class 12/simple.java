import java.util.Scanner;
class simple extends account
{
    protected double rate, si;int time;
    simple(String acno, String ifsc, String branch, double p, double rate, int time)
    {
        super(acno, ifsc, branch, p);
        this.rate=rate;
        this.time=time;
    }
    void display()
    {
        si=(p*rate*time)/100;
        System.out.println("Simple interest: "+si);
    }
}