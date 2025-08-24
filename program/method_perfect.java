/**WAP to input a number and check if it is a Perfect number using methods.
*/
 import java.util.Scanner;
 class method_perfect
 {
     void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,sum=0;
         System.out.println("Input number");
         a=sc.nextInt();
         perfect(a);
     }
     void perfect(int n)
     {
         int i,sum=0;
         for (i=1;i<n;i++)
         {
             if (n%i==0)
             {
                 sum=sum+i;
             }
         }
         if (sum==n)
         {
             System.out.println("The inputted number is a Perfect number");
         }
         else
         {
             System.out.println("The inputted number is not a perfect number");
         }
      }
 }