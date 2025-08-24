       import java.util.Scanner;
       class Select
       {
           public static void main()
           {
               Scanner sc=new Scanner(System.in);
               int c=0,num,r;
               System.out.println("Enter number between 1 and 1000");
               num=sc.nextInt();
               while(num>0)
               {
                   r=num%10;
                   num=num/10;
                   c++;
               }
               if(c==1)
               {
                   System.out.println("The number has 1 digit");
               }
               else if(c==2)
               {
                   System.out.println("The number has 2 digits");
               }
               else if(c==3)
               {
                   System.out.println("The number has 3 digits");
               }
               else
               {
                   System.out.println("The number entered is beyond the range");
               }
           }
       }