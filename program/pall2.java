 import java.util.Scanner;
        class pall2
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
                    n=s.lastIndexOf(' ');
                    if(n==-1)
                    {
                        n=s.length();
                    }
                    w=s.substring(n,s.length());
                    s=s.substring(0,n);
                    System.out.println(w);
                }
            }
        }