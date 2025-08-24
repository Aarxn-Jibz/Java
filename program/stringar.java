    import java.util.Scanner;
    class stringar
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i;String s;
            String ar[]=new String[5];
            System.out.println("Enter 5 names");
            for(i=0;i<5;i++)
            {
                ar[i]=sc.nextLine();
            }
            for(i=0;i<5;i++)
            {
                System.out.println(ar[i]);
            }
        }
    }