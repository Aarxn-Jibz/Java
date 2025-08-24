    import java.util.Scanner;
    class myClass
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Enter number of students");
            n=sc.nextInt();
            String name[]=new int[n];
            System.out.println("Input names of number of students inputted");
            for(i=0;i<n;i++)
            {
                String name[i]=sc.nextLine();
            }
            for(i=0;i<n;i++)
            {
                System.out.println(String[i]);
            }
        }
    }