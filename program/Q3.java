
/**
 *Write a program to accept two numbers and check they are twin prime or not using given
 *function:
 *boolean isprime(int): it will return true if the number is prime else return false.
 */
   import java.util.Scanner;
   class Q3
   {
       void main()
       {
           Scanner sc=new Scanner(System.in);
           int a,b;boolean x,y;
           System.out.println("Enter first number");
           a=sc.nextInt();
           System.out.println("Enter second number");
           b=sc.nextInt();
           x=isprime(a);
           y=isprime(b);
           if (x==true && y==true)
           {
               System.out.println("The number is a twin prime");
           }
           else
           {
               System.out.println("The number is not a twin prime");
            }
        }
        boolean isprime(int n)
        {
            int i,c=0;
            for(i=1;i<=n;i++);
            {
                if (n%i==0)
                {
                    c=c++;
                }
            }
            if (c==2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }