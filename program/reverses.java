/**W.A.P to accept 2 numbers and do the following:-
 * 1)Get the reverse of the first number
 * 2)Get the reverse of the second number
 * 3)Get the absolute difference between both the reverses
 * 4)Check if the difference is palindrome
 */
 import java.util.Scanner;
 class reverses
 {
     void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,b,rev1=0,rev2=0,diff,rev3;
         System.out.println("Input first number");
         a=sc.nextInt();
         System.out.println("Input second number");
         b=sc.nextInt();;
         rev1=fnrev(a);
         rev2=fnrev(b);
         diff=Math.abs(rev1-rev2);
         rev3=fnrev(diff);
         if (rev3==diff)
         {
             System.out.println("The difference is a palindrome");
         }
         else
         {
             System.out.println("The difference is not palindrome");
         }
      }
      int fnrev(int x)
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