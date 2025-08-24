
/** 
 *Display the factorial of a number using function
 */
 import  java.util.Scanner;                 //importing Scanner class
 class function_factorial                   //opening class
 {
     public void main()
     {
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("Enter Number");
         n=sc.nextInt();
         fnfactorial(n);
      }
         void fnfactorial(int n)
         {
           int i,s=1;
           for (i=1;i<=n;i++)
           {
               s=s*i;
           }
           System.out.println(s);
          }
  }