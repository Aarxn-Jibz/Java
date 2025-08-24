        import java.util.Scanner;
        class samp4
        {
            public static void main()
            {
                Scanner sc=new Scanner (System.in);
                int i,sum=0,max=-99999;
                int ar[]=new int[20];
                System.out.println("Input terms");
                for(i=0;i<20;i++)
                {
                    ar[i]=sc.nextInt();
                    sum=sum+ar[i];
                    if(max<ar[i])
                    {
                        max=ar[i];
                    }
                }
                System.out.println("The sum is "+sum);
                System.out.println("The maximum value is "+max);
            }
        }