/**Design a menu driven program to find the addition,subtraction,multiplication & 
 * division of 2 numbers as per user choice.
 */ 
 import java.util.Scanner;
 class calculator                        //opening class
 {
     public static void main()           //opening void main
     {
         Scanner sc=new Scanner(System.in);
         int ch,a,b,r;
         System.out.println("Enter 2 numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         System.out.println("Press 1 for Addition");
         System.out.println("Press 2 for Subtraction");
         System.out.println("Press 3 for Multiplication");
         System.out.println("Press 4 for Division");
         ch=sc.nextInt();
         switch(ch)
         {
             case 1:
             r=a+b;
             System.out.println(r);
             break;
             case 2:
             r=a-b;
             System.out.println(r);
             break;
             case 3:
             r=a*b;
             System.out.println(r);
             break;
             case 4:
             r=a/b;
             System.out.println(r);
             break;
             default:
             System.out.println("Invalid choice");
            }
        }                         //opening void main
    }                             //opening class
