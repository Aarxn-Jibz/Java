/**
 * write a program to find the midpoint of two given points.. the details of the class
 * is given below
 * 
 * class name:              Point
 * data members:            x and y as int co-ordinates
 * member methods:      
 *                          Point()
 *                          Point(int,int)
 *                          void display()
 *                          Point midpoint(Point)
 */
import java.util.Scanner;
class Point
{
    int x,y;
    Point()
    {}
    Point(int a,int b)
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println(x+":"+y);
    }
    void midpoint(Point p1,Point p2)
    {
        
        x=(p1.x+p2.x)/2;
        y=(p1.y+p2.y)/2;
        
    }
}

class initial
{
    void main()
    {
        Point ob1=new Point(4,5);
        Point ob2=new Point(10,20);
        Point ob3=new Point();
        ob3.midpoint(ob1+ob2.midpoint);
        ob3.display();
    }
}