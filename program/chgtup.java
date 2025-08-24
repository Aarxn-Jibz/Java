    import java.util.Scanner;
    class chgtup
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,w;int i,n,length;
            System.out.println("Enter word");
            s=sc.nextLine().trim();
            length=s.length();
            while(length>0)
            {
                n=s.indexOf(' ');
                if(s.indexOf(' ')==-1)
                {
                    n=s.length();
                }
                w=s.substring(0,n);
                s=s.substring(n);
                System.out.print(w.charAt(0).toUpperCase(w));
            }
        }
    }