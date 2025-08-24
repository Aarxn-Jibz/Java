     import java.util.*;
     class datecw15June
     {
         void main()
         {
             Scanner sc=new Scanner(System.in);
             int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
             int d,m,y;
             System.out.println("enter date,month and year");
             d=sc.nextInt();
             m=sc.nextInt();
             y=sc.nextInt();
             if(y%400==0 || (y%4==0 && y%100!=0))
             ar[1]=29;
             if(d<1 ||m<1 || m>12 || y<1 || d>ar[m-1])
             System.out.println("Invalid");
             else
             System.out.println("valid");
         }
     }