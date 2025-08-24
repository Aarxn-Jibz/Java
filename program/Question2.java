/**
 * In an organization, the Income Tax for employees is computed as per the following slab rates:
	Slabs (Taxable Income) Rate of Income Tax
	Upto Rs 1,10,000 Nil
	Rs 1,10,001 to Rs 1,50,000 10% of income exceeding Rs 1,10,000
	Rs 1,50,001 to Rs 2,50,000 Rs 4,000 + 20% of income exceeding Rs1,50,000
	Above Rs 2,50,000 Rs 24,000 + 30% of income exceeding Rs2,50,000
	Write a program in Java which will accept the income and calculate their income tax.
 */
import java.util.*;          //to import scanner class
class Question2              //opening class
{
 public static void main()   //opening void main
 {
     int i;
     double tax;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter income");
     i=sc.nextInt();
     if(i<=110000)
     tax=0.0;
     else if(i>110000 && i<=150000)
     tax=10.0/100*(i-110000);
     else if(i>150000 && i<=250000)
     tax=4000+(20.0/100*(i-150000));
     else
     tax=24000+(30.0/100*(i-250000));
     System.out.println("Income Tax to be paid="+tax);
    }                         //closing void main
}                             //closing class