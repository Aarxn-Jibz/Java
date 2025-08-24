/**Diserium number (e.g. 135=1^1+3^2+5^3)
 * Check if a number is a diserium number or not.
 */
 import java.util.Scanner;
 class diserium                            //opening class
 {
     int n,r,cpy,c=0,s=0;
     void input()                          //opening void main
     {   
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
         n=sc.nextInt();
     }
     void check()
     {
         cpy=n;
         while (cpy>0)
         {
             r=cpy%10;
             cpy=cpy/10;
             s=s+(int)(Math.pow(r,c));
             c--;
         }
         if (s==n)
         {
              System.out.println("The number is a diserium number");
         }
         else
         {
              System.out.println("The number is not a diserium number");
         }
     }
     public static void main()
     {
         diserium ob=new diserium();
         ob.input();
         ob.check();
     }
 }                                         //closing class
             