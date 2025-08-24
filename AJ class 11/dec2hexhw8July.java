    import java.util.Scanner;
    class dec2hexhw8July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s="";int n,r;
            System.out.println("Enter number in decimal");
            n=sc.nextInt();
            while(n>0)
            {
                r=n%16;
                n=n/16;
                if(r<10)
                {
                    s=r+s;
                }
                else if(r>9)
                {
                    if(r==10)
                    {
                        s='A'+s;
                    }
                    else if(r==11)
                    {
                        s='B'+s;
                    }
                    else if(r==12)
                    {
                        s='C'+s;
                    }
                    else if(r==13)
                    {
                        s='D'+s;
                    }
                    else  if(r==14)
                    {
                        s='E'+s;
                    }
                    else
                    {
                        s='F'+s;
                    }
                }
            }
            System.out.println(s);
        }
    }