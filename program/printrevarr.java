    import java.util.Scanner;
    class printrevarr
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i;
            int ar[]=new int[10];
            System.out.println("Input elements");
            for(i=0;i<10;i++);
            {
                ar[i]=sc.nextInt();
            }
            for(i=9;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
        }
    }