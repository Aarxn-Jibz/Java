/**W.A.P to check whether inputted number is prime or not
 */
   import java.util.Scanner;
   class prime
   {
       public static void main()
       {
           Scanner sc=new Scanner(System.in);
           int i=0,a,c=0;
           System.out.println("Input a number");
           a=sc.nextInt();
           for (i=1;i<=a;i++)
           {
               if (a%i==0)
               {
                   c++;
               }
               
            }
            if (c==2)
            {
                System.out.println("The inputted number is a prime number");
            }
            else
            {
                System.out.println("The inputted number is not a prime number");
            }
        }
    } 