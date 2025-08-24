/** 
 *Design a class named ShowRoom with the following  description
 *Instance variable/Data members:
 *String name:to store the name of the customer
 *long mobno:To store the mobile number of a customer
 *double cost:To store the discount amount
 *double dis: To store the discount amount 
 *double amount:To store the discount amount
 *Member methods:
 *ShowRoom()-default constructor to initialize data members
 *void input()-to input customer name,mobile number,cost
 *void calculate()-To calculate discount on the cost of purchased items based on the 
 *following criteria:
 *Cost                        Discount
 *<=10000                      5%
 *10000> && <=20000            10%
 *20000> && ,=35000            15%
 *More than 35000              20%
 *void display():to display customer name,mobile number,amount to be paid after discount
 *write a main method to create an object of the class and cll the above member methods
 */
     import java.util.Scanner;
     class ShowRoom
     {
         String name;long mobno;double cost;double dis;double amount;
         ShowRoom()
         {
             cost=0.0;
             dis=0.0;
         }
         void input ()
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Input name");
             name=sc.nextLine();
             System.out.println("Input mobile number");
             mobno=sc.nextLong();
             System.out.println("Input cost");
             cost=sc.nextDouble();
         }
         void calculate()
         {
             if (cost<=10000)
             {
                 dis=5.0/100*cost;
                 amount=cost-dis;
             }
             else if(cost>10000 && cost <=20000)
             {
                 dis=10.0/100*cost;
                 amount=cost-dis;
             }
             else if (cost>20000 && cost<=35000)
             {
                 dis=15.0/100*cost;
                 amount=cost-dis;
             }
             else if (cost>35000)
             {
                 dis=20.0/100*cost;
                 amount=cost-dis;
             }
         }
         void display()
         {
             System.out.println("Name:"+name);
             System.out.println("Mobile number:"+mobno);
             System.out.println("Amount:"+amount);
         }
         void main()
         {
             ShowRoom ob=new ShowRoom();
             ob.input();
             ob.calculate();
             ob.display();
         }
     }