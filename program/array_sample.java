/**
 * accept n numbers in an array and display all the prme numbers present in the array
 */
 import java.util.Scanner;
 class array_sample
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,i,j,c=0;
         System.out.println("Enter the limit");
         n=sc.nextInt();
         int ar[]=new int [n];
         for(i=0;i<n;i++)
         {
             System.out.println("Enter the element");
             ar[i]=sc.nextInt();
         }
         for(i=0;i<n;i++)
         {
            for(j=1;j<=ar[i];j++)
             {
                 if(ar[i]%j==0)
                 c++;
             }
         }
         if(c==2)
         {
             System.out.println("The prime number ="+ar[i]);
            }
        }
    }