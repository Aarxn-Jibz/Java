import java.util.Scanner;
class ala
{
    public static void main()
    {
        discount ob=new discount();
        tax ob1=new tax();
        double amt=ob.process(5000,7);
        System.out.println("Discounted amount is: "+amt);
        amt=ob1.process(amt,5.5);
        System.out.println("Payable amount: "+amt);
    }
}