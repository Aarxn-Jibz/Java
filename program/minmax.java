        import java.util.Scanner;
        class minmax
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,n,max,min;
                System.out.println("Enter number of terms to be inputted in the array");
                n=sc.nextInt();
                int ar[]=new int[n];
                System.out.println("Enter terms");
                for(i=0;i<n;i++)
                {
                    ar[i]=sc.nextInt();
                }
                min=ar[0];
                max=ar[0];
                for(i=0;i<n;i++)
                {
                    if(i>max)
                    {
                        max=i;
                    }
                    else if(i<min)
                    {
                        min=i;
                    }
                }
                System.out.println("max is"+max);
                System.out.println("Min is "+min);
            }
        }