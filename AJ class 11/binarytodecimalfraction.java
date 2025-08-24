    import java.util.Scanner;
    class binarytodecimalfraction
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,w="",d="";int i,c=0,c1=0,sum=0,sum1=0,tot;
            System.out.println("Enter numbers in binary");
            s=sc.nextLine();
            for(i=s.length()-1;i>=0;i--)
            {
                if ((int)s.charAt(i)==46)
                {
                    d=s.substring(i+1);
                    w=s.substring(0,i);
                    break;
                }
            }
            for(i=w.length()-1;i>=0;i--)
            {
                int a=(int)w.charAt(i)-48;
                sum=sum+a*(int)Math.pow(2,c);
                c++;
            }
            c1=d.length()-1;
            for(i=d.length()-1;i>=0;i--)
            {
                int b=(int)d.charAt(i)-48;
                sum1=sum1+b*(int)Math.pow(2,c1);
                c1--;
            }
            tot=sum+sum1;
            System.out.println("The number in decimal is "+tot);
        }
    }