/**Display the factorial of 2 number using function
 */
 import  java.util.Scanner;
 class function2factorial
 {
     public void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,m;
         System.out.println("Enter Number");
         n=sc.nextInt();
         m=sc.nextInt();
         fnfactorial(n);
         fnfactorial(m);
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