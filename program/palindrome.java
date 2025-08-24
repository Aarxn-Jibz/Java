/** 
 *W.A.P to check if the number is a palindrome number or not.Palindrome numbers are 
 * numbers which are equal to their reverse values.
 */
 import java.util.Scanner;    // importing Scanner class
 class palindrome             //opening class
 {
     public static void main()//opening void main
     {
         Scanner sc=new Scanner (System.in);
         int n,r,i,rev=0;
         System.out.println("Enter Number");
         n=sc.nextInt();
         i=n;
         while (n>0)
         {                    //opening while loop
             r=n%10;
             n=n/10;
             rev=rev*10+r;
         }                    //closing while loop
         if (i==rev)
         {
             System.out.println("Palindrome number");
         }
         else
         {
              System.out.println("Not a Palindrome number");
         }
     }                        //closing void main
 }                            //closing class

             