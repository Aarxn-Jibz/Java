import java.util.Scanner;
class compound extends account
{
    protected double rate, ci;int time;
    compound(String acno, String ifsc, String branch, double p, double rate, int time)
    {
        super(acno, ifsc, branch, p);
        this.rate=rate;
        this.time=time;
    }
    void display()
    {
        ci=p*Math.pow((1+rate)/100,time);
        System.out.println("Compound interest: "+ci);
    }
}