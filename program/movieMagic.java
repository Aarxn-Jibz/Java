
/**
 * Write a program to input the title,year released and rating of a movie.
 * Calculate whether the movie was a flop,semi hit,hit or a super hit
 *   0-2         flop
 *   2-3.4       semi-hit
 *   3.5-4.5     hit
 *   4.6-5       super-hit
 */
 import java.util.Scanner;
 class movieMagic
 {
     int year;String title;float rating;
     public movieMagic()
     {
         year=0;
         title="";
         rating=0.0f;
     }
     void accept()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Input title:");
         title=sc.nextLine();
         System.out.println("Input year:");
         year=sc.nextInt();
         System.out.println("Input rating(out of 5):");
         rating=sc.nextFloat();
     }
     void display()
     {
         System.out.println(title);
         if(rating<=2.0)
         {
             System.out.println("Flop");
         }
         else if (rating>2.0 && rating<=3.4)
         {
             System.out.println("Semi-hit");
         }
         else if (rating>=3.5 && rating<=4.5) 
         {
             System.out.println("Hit");
         }
         else if (rating>=4.6 && rating<=5.0)
         {
             System.out.println("Super-hit");
         }
     }
     public static void main()
     {
         movieMagic ob=new movieMagic();
         ob.accept();
         ob.display();
     }
 }