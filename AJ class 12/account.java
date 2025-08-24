import java.util.Scanner;
class account
{
    protected String acno, ifsc, branch; double p;
    account(String acno, String ifsc, String branch, double p)
    {
        this.acno=acno;
        this.ifsc=ifsc;
        this.branch=branch;
        this.p=p;
    }
    void display()
    {
        System.out.println("IFSC code is: "+ifsc);
        System.out.println("Branch Name is: "+branch);
        System.out.println("Account number: "+acno);
        System.out.println("Principal: Rs."+p);
    }
}