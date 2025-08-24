    import java.util.Scanner;
    class amicablecw22July
    {
        int range;
        void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Input higher range");
            range=sc.nextInt();
        }
        void calculate()
        {
            int i,j,s1,s2;
            for(i=2;i<range;i++)
            {
                for(j=i+1;j<range;j++)
                {
                    s1=getsum(i);
                    s2=getsum(j);
                    if(s1==j && s2==i)
                    {
                        System.out.println(i+","+j);
                    }
                }
            }
        }
        int getsum(int n)
        {
            int i,sum=0;
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
            return sum;
        }
        public static void main()
        {
            amicablecw22July ob=new amicablecw22July();
            ob.input();
            ob.calculate();
        }
    }