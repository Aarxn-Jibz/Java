 /**
  * W.A.P to input a number and find the total number of prime digits in this number.
  */
 import java.util.Scanner;
 class school
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int n,r,npd=0,c=0;
         System.out.println("Enter number");
         n=sc.nextInt();
         while (n>0)
         {
             r=n%10;
             n=n/10;
             if (r==2 || r==3 || r==5 || r==7)
             {
             c++;
             }
             else
             {
                 npd=npd++;
             }
        }
         System.out.println("The total number of prime digits in the number is(are) "+c);
      }
}             
