    import java.util.Scanner;
    class decimalhw7July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String n;int i,c=0,sum=0;
            System.out.println("Enter number in binary");
            n=sc.nextLine();
            for(i=n.length()-1;i>=0;i--)
            {
                int d=(int)n.charAt(i)-48;
                sum=sum+d*(int)Math.pow(2,c);
                c++;
            }
            System.out.println(sum);
        }
    }