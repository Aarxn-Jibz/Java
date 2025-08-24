/**
 *WAP to convert the given number of days into months and days.Assume each month is 30 
 *days.
 */
    import java.util.Scanner;
    class monthday
    {
        public static void main()
        {
            Scanner sc=new Scanner (System.in);
            int d=0,m,r;
            System.out.println("Enter number of days");
            r=sc.nextInt();
            d=r%30;
            m=r/30;
            System.out.println(m+"months and "+d+"days");
        }
    }