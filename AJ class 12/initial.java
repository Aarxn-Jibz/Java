/**
 * OBJECT REFERENCING: PASSING AND RETURNING AN OBJECT BY THE FUNCTIONS.
 
int a;
test ob;

sopln(a);
sopln(ob);  // address of the data

fun(a);     // call by value

fun(ob);    // call by reference
*/


class test
{
    int n;
    void display()
    {
        n++;
        System.out.println("hi"+n);
    }
}

public class initial
{
    public static void main()
    {
        test ob=new test();
        System.out.println(ob);
        ob.display();
        fun(ob);        // call by reference
        ob.display();
    }
    static void fun(test t)
    {
        t.display();
    }
        

}