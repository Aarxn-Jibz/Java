/**
 * Design a class named as Number to display the HCF of 4 integers. The details are given below
 * Class name: : Number
 * Data Members: : n as integer
 * Member Methods :
 * Number () : constructor
 * void input() : to input n from user
 * void output() : to display n
 * Number getHCF(Number) : It will return an object that stores the HCF of two Number
 */
import java.util.Scanner;
class Number
{
    int n;
    void main()
    {
        Number ob=new Number();
        ob.input();
        ob.output();
        Number ob2=new Number();
        ob2.input();
        ob2.output();
        Number ob3=new Number();
        ob3.input();
        ob3.output();
        Number ob4=new Number();
        ob4.input();
        ob4.output();
        Number ob5=new Number();
        ob5=ob.getHCF(ob2);
        ob5=ob5.getHCF(ob3);
        ob5=ob5.getHCF(ob4);
    }
    Number getHCF(Number a)
    {
        int rem,quo;
        while(n>0)
        {
            if(a.n%n!=0)
            {
                a.n=n;
                n=a.n%n;
            }
        }
        return n;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input n:");
        n=sc.nextInt();
    }
    void output()
    {
        System.out.println(n);
    }
}