import java.util.Scanner;
class dattte
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String day;int r,n,i,c=0,date,finale;
        System.out.println("Day of first January of the year");
        day=sc.nextLine();
        String ar[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Input date");
        date=sc.nextInt();
        System.out.println("Input final date");
        finale=sc.nextInt();
    }
}