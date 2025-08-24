/** Class name =number
 * data member=n,c as integer
 * void input()(n) to accept number from user
 * void find() to find number of factors of a number 
 * void display() to display whether the number is prime or not 
 */
 import java.util.Scanner;
 class number
 {
     int n,c;
     void input()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
         n=sc.nextInt();
     }
     void find()
     {
         int i;
         for(i=1;i<=n;i++)
         {
             if (n%i==0)
             {
                 c++;
             }
         }
     }
     void display()
     {
         if (c==2)
         {
             System.out.println("The inputted number is a prime number");
         }
         else 
         {
             System.out.println("The inputted number is not a prime number");
         }
     }
     void main()
     {
         number ob=new number();
         ob.input();
         ob.find();
         ob.display();
     }
 }