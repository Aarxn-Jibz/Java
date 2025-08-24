    import java.util.Scanner;
    class hex2bincw13July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,s1="";int i,r,c=0,sum=0;
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
            while(sum>0)
            {
                r=sum%2;
                sum=sum/2;
                s1=r+s1;
            }
            System.out.println("The number in binary is "+s1);
        }
    }