/**Display the smallest digit of a number
 */
 import java.util.Scanner;
 class minimum            //opening class
 {
     public static void main()     //opening void main
     {
         Scanner sc=new Scanner (System.in);
         int i,n,r,min=9;        
         System.out.println("Enter number");
         n=sc.nextInt();
         i=n;
         while(n>0)
         {
             r=n%10;
             n=n/10;
             if (r<min)
             min=r;
            }
            System.out.println("The smallest digit of the number "+i+" is "+min);
        }                   //closing void main
    }                       //closing class
                