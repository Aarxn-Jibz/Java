/**
 *  A computer dealer sells computer at the following rates:			
( a ) Rs. 35000 per computer for less then 20 computers.
		( b ) Rs. 31000 per computer for 20 to 39 computers.
( c ) Rs. 29000 per computer for 40 or more computers.
      	 Write a program to take the number of computers as input and display the bill.
 */
import java.util.Scanner;    //to open scanner
public class question        //opening class 
{
 public static void main()   //opening void main
 {
     int n,amt;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of computers purchased");
     n=sc.nextInt();
     if(n>0 && n<20)
     amt=n*35000;
     else if(n>=20 && n<=39)
     amt=n*31000;
     else
     amt=n*29000;
     System.out.println("Total billing amount="+"Rs."+amt);
    }                        //closing void main
}                            //closing void main
