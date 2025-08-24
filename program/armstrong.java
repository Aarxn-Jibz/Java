/**Check if the number is an armstrong number or not
 */
 import java.util.Scanner;
 class armstrong  //opening class
 {
     public static void main()    //opening void main
     {
         Scanner sc=new Scanner (System.in);
         int n,r,i,cube=0;
         System.out.println("Enter number");
         n=sc.nextInt();
         i=n;
         while (n>0)
         {
             r=n%10;
             n=n/10;
             cube=cube+r*r*r;
         }
         if (cube==i)
         {
           System.out.println("Armstrong number");
        }
        else
        {
           System.out.println("Not an armstrong number");
        }
        
     }            //closing void main
 }                //closing class
         
             
         