/**W.A.P to accept 2 numbers and check whether they are twin prime or not
 */
      import java.util.Scanner;
      class question14
      {
          void main()
          {
              Scanner sc=new Scanner(System.in);
              int a,b,c1,c2;
              System.out.println("Enter first number");
              a=sc.nextInt();
              System.out.println("Enter second number");
              b=sc.nextInt();
              c1=getcount(a);
              c2=getcount(b);
              if (c1==2 && c2==2 && Math.abs(a-b)==2)
              {
                  System.out.println("The given numbers are twin prime");
              }
              else
              {
                  System.out.println("The given numbers are not twin prime");
              }
          }
         int getcount(int n)
         {
             int i,c=0;
             for (i=1;i<=n;i++)
             {
                 if (n%i==0)
                 c++;
              }
              return c;
          }
      }