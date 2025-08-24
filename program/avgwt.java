        import java.util.Scanner;
        class avgwt
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i;double sum=0.0,avg;
                double ar[]=new double[10];
                System.out.println("Input weight of 10 students");
                for(i=0;i<10;i++)
                {
                    ar[i]=sc.nextDouble();
                    sum=sum+ar[i];
                }
                avg=sum/10;
                System.out.println("Average is:"+avg);
                for(i=0;i<10;i++)
                {
                    if(ar[i]>avg)
                    {
                        System.out.println(ar[i]);
                    }
            }
        }
    }