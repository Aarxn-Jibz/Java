    import java.util.Scanner;
    class hex2deccw8July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s;int i,r,c=0,sum=0;
            System.out.println("Enter number in hexadecimal");
            s=sc.nextLine();
            for(i=s.length()-1;i>=0;i--)
            {
                int d=(int)s.charAt(i)-48;
                if(d>9)
                {
                    d=(int)s.charAt(i)-55;
                }
                sum=sum+d*(int)Math.pow(16,c);
                c++;
            }
            System.out.println(sum);
        }
    }