/**
 *Accept two numbers and do the following using function[ int getrev(int) ]: (15)
i) Get the reverse of first number
ii) Get the reverse of 2nd number
iii) Get the absolute difference between the reversed numbers
iv) Check that difference is palindrome or not.
 */
 import java.util.Scanner;
 class Q4
 {
     void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,b,rev1=0,rev2=0,diff,rev3;
         System.out.println("Input first number");
         a=sc.nextInt();
         System.out.println("Input second number");
         b=sc.nextInt();;
         rev1=getrev(a);
         rev2=getrev(b);
         diff=Math.abs(rev1-rev2);
         rev3=getrev(diff);
         if (rev3==diff)
         {
             System.out.println("The difference is a palindrome");
         }
         else
         {
             System.out.println("The difference is not palindrome");
         }
      }
      int getrev(int x)
      {
          int r,rev=0;
          while (x>0)
          {
              r=x%10;
              x=x/10;
              rev=rev*10+r;
          }
          return (rev);
      }
  }