/**WAP to input a number and check if it is prime and palindrome using methods.
 */
   import java.util.Scanner;
   class prime_palindrome
   {
       void main()
       {
           Scanner sc=new Scanner(System.in);
           int r,a,n=0,c=0,rev=0,i=1;
           System.out.println("Enter number");
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
                while (a>0)
                {
                    r=a%10;
                    a=a/10;
                    rev=rev*10+r;
                }
                if (rev==a)
                {
                    System.out.println("The number is prime palindrome");
                }
                else 
                {
                    System.out.println("The number is not prime palindrome");
                }
            }
            else
            System.out.println("The number is not prime palindrome");
        }
   }
   