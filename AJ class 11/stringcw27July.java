    import java.util.Scanner;
    class stringcw27July
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,w;int i,n;
            System.out.println("Enter a sentence");
            s=sc.nextLine();
            while(s.length()>0)
            {
                s=s.trim();
                n=s.indexOf(s);
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