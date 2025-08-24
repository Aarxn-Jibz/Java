
/**class name: bill
 * data member:
 *             u as integer amt as double
 * member methods:
 *                void input(): to accept total number of units.
 *                void calculate(): to calculate the amount as given below
 *                                unit        charge/unit
 *                                first 100   0.50
 *                                next 50     0.65
 *                                next 50     0.85
 *                                above 200   1.25
 *                void display(): to display the payable amount after adding the tax as
 *                12.5 % on the amount.
 */
    import java.util.Scanner;
    class bill
    {
        int u;double amt;
        void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter total number of units consumed");
            u=sc.nextInt();
        }
        void calculate()
        {
            double a=0;
            if (u<=100)
            {
                a=u*0.5;
            }
            else if (u<=150)
            {
                a=100*0.5+(u-100)*0.65;
            }
            else if (u<=200)
            {
                a=100*0.5+50*0.65+(u-150)*0.85;
            }
            else if (u>200)
            {
                a=100*0.5+50*0.65+50*0.85+(u-200)*1.25;
            }
            amt=a+12.5/100*a;
        }
        void display()
        {
            System.out.println("The amount to be paid (inclusive of tax) is "+amt);
        }
        public static void main()
        {
           bill ob=new bill();
           ob.input();
           ob.calculate();
           ob.display();
        }
    }           