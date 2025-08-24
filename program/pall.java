        import java.util.Scanner;
        class pall
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                String s,w;int i,n;
                System.out.println("Enter sentence");
                s=sc.nextLine();
                for(i=0;i<s.length();i++)
                {
                    s=s.trim();
                    n=s.indexOf(' ');
                    if(n==-1)
                    {
                        n=s.length();
                    }
                    w=s.substring(0,n);
                    s=s.substring(n);
                    System.out.println(w);
                }
            }
        }