    import java.util.Scanner;
    class real
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int num,grt=-999999,i,small=999999;
            System.out.println("Enter 10 numbers");
            int ar[]=new int[10];
            for(i=0;i<10;i++);
            {
                ar[i]=sc.nextInt();
                if (ar[i]>grt)
                {
                    grt=ar[i];
                }
                else if (ar[i]<small)
                {
                    small=ar[i];
                }
            }
            System.out.println(grt);
            System.out.println(small);
        }
    }