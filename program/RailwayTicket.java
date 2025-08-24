/**
 * Write a program to input the name,type of coach(Sleeper,First_Ac,Second_AC,Third_AC) and no.of tickets.
 * Calculate the price of the tickets and display
 * Sleeper      Rs.500
 * First_AC     Rs.500+Rs..700*no. of tickets
 * Second_Ac    Rs.500+500*no. of tickets
 * Third_Ac     Rs.250+500*no. of tickets
 */
   import java.util.Scanner;
   class RailwayTicket
   {
       String name,coach;int n,totalamt;
       void accept()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Input name");
           name=sc.nextLine();
           sc.nextLine();
           System.out.println("Input coach(First_AC,Second_AC,Third_AC,Sleeper");
           coach=sc.nextLine();
           sc.nextLine();
           System.out.println("Input numbe rof tickets booked");
           n=sc.nextInt();
        }
        void update()
        {
            if(coach.equalsIgnoreCase("First_AC")==true)
            {
                totalamt=500+(n*700);
            }
            else if(coach.equalsIgnoreCase("Second_AC")==true)
            {
                totalamt=500+(n*500);
            }
            else if(coach.equalsIgnoreCase("Third_AC")==true)
            {
                totalamt=500+(n*250);
            }
            else
            {
                totalamt=n*500;
            }
        }
        void display()
        {
            System.out.println("Name:"+name);
            System.out.println("Type of coach:"+coach);
            System.out.println("Total amount:Rs."+totalamt);
            System.out.println("_____________________________");
        }
        void main()
        {
            RailwayTicket ob=new RailwayTicket();
            ob.accept();
            ob.update();
            ob.display();
        }
    }