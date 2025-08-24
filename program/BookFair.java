/**
 * Write a description of class BookFair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
class BookFair
{
	String Bname;double price;
	BookFair()
	{
	    Bname="";
	    price=0.0;
	}
	void input()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Input name of the book:");
	    Bname=sc.nextLine();
	    sc.nextLine();
	    System.out.println("Price of the book:");
	    price=sc.nextDouble();
	}
	void calculate()
	{
	    if(price<=1000)
	    {
	        price=price-2/100*price;
	    }
	    else if(price>1000 && price<=3000)
	    {
	        price=price-10/100*price;
	    }
	    else if (price>3000)
	    {
	        price=price-15/100*price;
	    }
	}
	void display()
	{
	    System.out.println("Name of the book:"+Bname);
	    System.out.println("Price of the book:"+price);
	}
	void main()
	{
	    BookFair ob=new BookFair();
	    ob.input();
	    ob.calculate();
	    ob.display();
	}
}
