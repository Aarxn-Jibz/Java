/**
 * Write a description of class MoBike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    import java.util.Scanner;
    class MoBike
    {
        int bno,phno,days,charge;String name;
        MoBike()
        {
            name="Aaron Jibin";
            bno=phno=days=charge=0;
        }
        void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Input name");
            name=sc.nextLine();
            sc.nextLine();
            System.out.println("Input bike number");
            bno=sc.nextInt();
            System.out.println("Input phone number");
            phno=sc.nextInt();
            System.out.println("Input number of days rented");
            days=sc.nextInt();
        }
        void compute()
        {
            if(days>=1 && days<=5)
            {
                charge=days*500;
            }
            else if(days>5 && days<=10)
            {
                charge=5*500+((days-5)*400);
            }
            else if(days>10)
            {
                charge=5*500+5*400+((days-10)*200);
            }
        }
        void display()
        {
            System.out.println("Bike No.:"+bno);
            System.out.println("Phone No.:"+phno);
            System.out.println("Name:"+name);
            System.out.println("No. of days:"+days);
            System.out.println("Charge:"+charge);
        }
    }