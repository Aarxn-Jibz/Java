     import java.util.Scanner;
     class HotelBooking
     {
         String name,DOB,roomno;long phoneno;int time,ACdays,nondays,acprice=600,nonprice=500,persons,bed,AC,non;double roomcharge;
         void input()
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter name");
             name=sc.nextLine();
             sc.nextLine();
             System.out.println("Enter Date of Birth");
             DOB=sc.nextLine();
             sc.nextLine();
             System.out.println("Enter Phone number");
             phoneno=sc.nextLong();
             System.out.println("How many people are there (Total)");
             persons=sc.nextInt();
             System.out.println("How many AC rooms do you require");
             AC=sc.nextInt();
             System.out.println("How many daysdo you need it");
             ACdays=sc.nextInt();
             System.out.println("How many non AC rooms do you require?");
             non=sc.nextInt();
             System.out.println("How many days do you need it");
             nondays=sc.nextInt();
         }
         void compute()
         {
             roomcharge=AC*ACdays*acprice+non*nondays*nonprice;
             time=ACdays+nondays;
         }
         void display()
         {
             System.out.println("Name:"+name);
             System.out.println("Date of birth:"+DOB);
             System.out.println("Phone number:"+phoneno);
             System.out.println("AC rooms:"+AC);
             System.out.println("Non AC rooms:"+non);
             System.out.println("Number of days:"+time);
             System.out.println("Total amount:"+roomcharge);
         }
         public static void main()
         {
             HotelBooking ob=new HotelBooking();
             ob.input();
             ob.compute();
             ob.display();
         }
     }