/**
 * Design class Bank with the following descriptions :
	Data members :
		name : to store the name of the depositor		
		acno : to store the account number
		type : to store type of the account			
		bal : to store the balance amount in the account
	Member functions :
		Bank( ) : constructor to assign the data members as 0 or null
		depo( ) : to deposit an amount
        withdraw( int ) : to withdraw an amount after checking the balance
        (Minimum balance should be Rs.500)
		print( ) : to print the all the details
*/
 import java.util.Scanner;
 class bank
 {
     String name;
     long acno;
     String type;
     double bal;
     bank()
     {
         acno=0;
         bal=0.0;
     }
     void depo()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter amount to be deposited");
         bal=sc.nextDouble();
     }
     void withdraw (int bal)
     {
         Scanner sc=new Scanner(System.in);
         int a;double d;
         System.out.println("Enter amount to be withdrawed");
         a=sc.nextInt();
         d=bal-a;
         if (d>500)
         {
             a=bal-500;
         }
         else
         {
             System.out.println("Amount less than 500 will be in account");
         }
     }
     void print()
     {
         System.out.println("Amount left in bank is:"+bal); 
     }
     void main()
     {
         bank ob=new bank();
         ob.depo();
         ob.withdraw(1000);
         ob.print();
      }
 }