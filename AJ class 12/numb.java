import java.util.*;
class number
{
    int n;
    number()
    {}
    number(int a)
    {
        n=a;
    }
    void display()
    {
        System.out.println(n);
    }
    void sum(number ob1,number ob2)
    {
        n=ob1.n+ob2.n;
        
    }
}

public class initial
{
    void main()
    {
        number ob1=new number(50);
        number ob2=new number(100);
        number ob3=new number();
        ob3.sum(ob1,ob2);
        ob3.display();
    }
}