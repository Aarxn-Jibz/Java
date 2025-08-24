    import java.util.Scanner;
    class lenulo
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,uc,lc;int l;
            System.out.println("Input a string");
            s=sc.nextLine();
            l=s.length();
            uc=s.toUpperCase();
            lc=s.toLowerCase();
            System.out.println("Length:"+l);
            System.out.println("Upper case:"+uc);
            System.out.println("Lower case:"+lc);
        }
    }
    