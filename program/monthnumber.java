/**
 * Accept the month number and display its corresponding number of days.
 */
   import java.util.Scanner;
   class monthnumber              //opening class
   {
       public static void main()   //opening void main
       {
           Scanner sc=new Scanner(System.in);
           int n;
           System.out.println("Enter Month Number");
           n=sc.nextInt();
           switch (n)
           {
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:
               System.out.println("31 days");
               break;
               case 2:System.out.println("28 days");
               break;
               case 4:
               case 6:
               case 9: 
               case 11:
               System.out.println("30 days");
               break;
               default:System.out.println("Invalid choice");
              }
        }               //opening void main
    }                   //opening class
           