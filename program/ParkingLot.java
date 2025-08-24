/**
 * Write a program to input the vehicle number and time parked
 * and print the bill
 */
import java.util.Scanner;
class ParkingLot
{
   int vno,hours;double bill;
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Vehicle number");
       vno=sc.nextInt();
       System.out.println("Enter number of hours parked");
       hours=sc.nextInt();
   }
   void calculate()
   {
       if(hours==1)
       {
           bill=3;
       }
       else if(hours>1)
       {
           bill=3+(hours-1)*1.5;
       }
    }
    void display()
    {
        System.out.println("Vehicle number:"+vno);
        System.out.println("No. of hours:"+hours);
        System.out.println("Bill amount:"+bill);
    }
    void main()
    {
       ParkingLot ob=new ParkingLot();
       ob.input();
       ob.calculate();
       ob.display();
    }
}