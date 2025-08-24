    import java.util.Scanner;
    class sumandav
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int i,sum=0,avg;
            int ar[]=new int[10];
            System.out.println("Enter 10 numbers");
            for(i=0;i<10;i++)
            {
                ar[i]=sc.nextInt();
                sum=sum+ar[i];
            }
            avg=sum/10;
            System.out.println(sum);
            System.out.println(avg);
        }
    }