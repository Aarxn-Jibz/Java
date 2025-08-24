/**display the frequency of all the digits of the number using following function
 * 
 * int getfreq(int n,int i)
  */
 import java.util.Scanner;
 class question15
 {
     void main()
     {
         Scanner sc=new Scanner(System.in);
         int i=0,cpy,n,c=0,r;
         System.out.println("Enter number");
         n=sc.nextInt();
         for (i=0;i<=9;i++)
         {
             c=getfreq(n,i);
             if (c>0)
             {
                 System.out.println(i+"="+c);
             }
         }
     }
     int getfreq(int n,int i)
     {
         int r,c=0;
         while (n>0)
         {
             r=n%10;
             n=n/10;
             if (r==i)
             c++;
          }
          return c;
     }
 }