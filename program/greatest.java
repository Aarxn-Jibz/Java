
/**
 *accept 3 strings and display the greatest among them
 */
    import java.util.Scanner;
    class greatest
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String a,b,c;
            System.out.println("enter the first string");
            a=sc.nextLine();
            System.out.println("Enter the second string");
            b=sc.nextLine();
            System.out.println("Enter the third String");
            c=sc.nextLine();
            if((a.compareTo(b))>0 && a.compareTo(c)>0)
            {
                System.out.println(a);
            }
            else if(b.compareTo(a)>0 && b.compareTo(c)>0)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }