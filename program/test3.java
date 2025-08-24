    import java.util.Scanner;
    class test3 
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int a,i;String s;
            System.out.println("Enter word");
            s=sc.nextLine();
            a=s.length()-1;
            for(i=a;i>0;i--)
            {
                System.out.print(s.charAt(i));
            }
        }
    }