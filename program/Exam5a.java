/**A Pre-Paid Auto service charges from the passenger as per the tariff given below:
 * Distance                Rate 
    Up to 5 km               75
    For the next 10 km       15/km
    For the next 10 km       10/km
    More than 25 km          8/km
 */
 import java.util.Scanner;
 class Exam5a
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int d,a=0;
         System.out.println("Enter distance");
         d=sc.nextInt();
         if (d<=5)
         {
             a=75;
         }
         else if (d<=15)
         {
             a=75+15*(d-5);
         }
         else if (d<=25)
         {
             a=75+15*10+10*(d-15);
         }
         else if (d>25)
         {
             a=75+15*10+10*10+8*(d-25);
         }
         System.out.println("Amount="+a);
        }
    }
        