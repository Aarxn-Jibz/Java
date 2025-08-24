/**
 *class -Electric_Bill
 *Instance variable/data member
 *String n-to store the name of customer
 *int units-to store number of units consumed
 *double bill-to store the amount to be paid
 *Member methods:
 *void accept()-to accept the name of the customer and number of units consumed
 *void calculate()-to calculate bill as per following tariff
 *Number of units            Rate per unit
 * first 100 units              Rs.2.00
 * Next 200 units               Rs.3.00
 * Above 300 units              Rs.5.00
 * A tax of 2.5%to be charged if the number of units consumed is above 300 units
 * void print()-to print the details as follows:
 * Name of the customer :....
 * Number of units consumed:...
 * Bill Amount:...
 * Write a main method to create an object  of the class and call the above member
 * methods
 */
     import java.util.Scanner;
     class Electricity_Bill
     {
         int units;double bill=0.0;String n;
         void accept()
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter name");
             n=sc.nextLine();
             System.out.println("Enter number of units consumed");
             units=sc.nextInt();
         }
         void calculate()
         {
             double a=0.0;
             if (units<=100)
             bill=units*2;
             else if (units>100 && units<=300)
             bill=100*2+(units-100)*3;
             else if (units>300)
             bill=100*2+200*3+(units-300)*5;
             bill=2.5/100*bill+bill;
         }
         void print()
         {
             System.out.println("Name of the consumer:"+n);
             System.out.println("Number of units consumed:"+units);
             System.out.println("Bill amount:"+bill);
         }
         void main()
         {
             Electricity_Bill ob=new Electricity_Bill();
             ob.accept();
             ob.calculate();
             ob.print();
         }
     }
        