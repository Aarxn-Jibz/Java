    import java.util.Scanner;
        class oc2dechw8July
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                String s;int i,r,c=0,sum=0;       
                System.out.println("Enter number in octal");
                s=sc.nextLine();
                for(i=s.length()-1;i>=0;i--)
                {
                    int d=(int)s.charAt(i)-48;
                    if(d>7)
                    {
                        System.out.println("Not octal");
                        System.exit(0);
                    }
                    sum=sum+d*(int)Math.pow(8,c);
                    c++;
                }
            }
        }