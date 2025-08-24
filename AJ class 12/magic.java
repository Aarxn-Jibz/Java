/**
 * A class magic is performing to check the user given number is magic no. or not.
 * Example: 28 is a magic no. because 2+8=10=1+0=1
 * if the final sum value is 1 then the original no i.e., 28 is magic number.
 * The details of the class are given below.
 * Class name : magic
 * Data members : n as integer 
 * Member functions :
 * Void readData() : to read the data from the user.
 * Int sumdigit(int x) : using recursive technique it will return the final sum  Value after extracting all the digits and make their sum.
 * Void checkMagic() : it will display the proper message if the original number is magic.
 */
import java.util.Scanner;
class magic
{
    int n;
    void readData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input n:");
        n=sc.nextInt();
    }
    void checkMagic()
    {
        int a;
        a=sumdigit(n);
        if(a==1)
        {
            System.out.println("Magic");
        }
        else
        {
            System.out.println("Not magic:");
        }
    }
    int sumdigit(int x)
    {
        int sum=0,r,cpy=0;
        cpy=x;
        if(x>9)
        {
            while(cpy>0)
            {
                r=cpy%10;
                cpy=cpy/10;
                sum=sum+r;
                sumdigit(sum);
            }
        }
        return x;
    }
}