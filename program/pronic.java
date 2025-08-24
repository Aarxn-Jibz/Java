/**Check if a number is a pronic number or not.
 * if the product of consecutive numbers is equal to the number.E.g. 4*5=20;3*4=12
 */
 import java.util.Scanner;
 class pronic
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,i,c=0;
         System.out.println("Enter Number");
         n=sc.nextInt();
         for(i=1;i<=n;i++)
         {
             if (i*(i+1)==n)
             {
                System.out.println("It is a Pronic number");
                c=1;
            }
         }
         if (c==0)
         System.out.println("It is not a Pronic number");
        }
 }