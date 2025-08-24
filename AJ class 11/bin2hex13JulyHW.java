    import java.util.Scanner;
    class bin2hex13JulyHW
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,sum1="";int d,i,r,n,c=0,sum=0;
            System.out.println("Enter number in binary");
            s=sc.nextLine();
            for(i=s.length()-1;i>=0;i--)
            {
                d=(int)s.charAt(i)-48;
                sum=sum+d*(int)Math.pow(2,c);
                c++;
            }
            while(sum>0)
            {
                r=sum%16;
                sum=sum/16;
                if(r>=0 && r<10)
                {
                    sum1=r+sum1;
                }
                else if(r==10)
                {
                    sum1='A'+sum1;
                }
                else if(r==11)
                {
                    sum1='B'+sum1;
                }
                else if(r==12)
                {
                    sum1='C'+sum1;
                }
                else if(r==13)
                {
                    sum1='D'+sum1;
                }
                else if(r==14)
                {
                    sum1='E'+sum1;
                }
                else if(r==15)
                {
                    sum1='F'+sum1;
                }
            }
            System.out.println(sum1);
        }
    }