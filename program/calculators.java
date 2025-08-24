import java.util.*;
public class calculators
{
    int a,b,result;
    Scanner sc=new Scanner(System.in);
    calculators()        // default constructor
    {
        a=b=result=0;
    }
    calculators(int x,int y) // parameterized constructor
    {
        a=x;
        b=y;
        result=0;
    }
    void input()
    {
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void sum()
    {
        result=a+b;
    }
    void output()
    {
        System.out.println(result);
    }
    static void main()
    {
        calculators ob=new calculators();
        ob.input();
        ob.sum();
        ob.output();
    }
}