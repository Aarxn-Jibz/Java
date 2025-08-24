/**
 *Design a program to print the name of the weekdays using switchcase.
 */
 import java.util.Scanner;
 class question12
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int a;
         System.out.println("Enter day number");
         a=sc.nextInt();
         switch(a)
         {
             case 1:
             System.out.println("Monday");
             break;
             case 2:
             System.out.println("Tuesday");
             break;
             case 3:
             System.out.println("Wednesday");
             break;
             case 4:
             System.out.println("Thursday");
             break;
             case 5:
             System.out.println("Friday");
             break;
             case 6:
             System.out.println("Saturday");
             break;
             case 7:
             System.out.println("Sunday");
             break;
             default:
             System.out.println("Invalid choice");
         }
     }
 }

         