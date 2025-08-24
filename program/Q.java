        import java.util.Scanner;
        class Q
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,n;String w,s;
                System.out.println("Enter sentence");
                s=sc.nextLine();
                System.out.println(" ");
                while(s.length()>0)
                {
                    s=s.trim();
                    n=s.indexOf(' ');
                    if (n==-1)
                    {
                        s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
                        break;
                    }
                    w=s.substring(0,n);
                    s=s.substring (n);
                    w=w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase();
                    System.out.print(w+" ");
                }
                System.out.println(s);
            }
        }