    import java.util.Scanner;
    class exa3
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,w,rev;int n;
            System.out.println("Enter word");
            s=sc.nextLine();
            while(s.length()>0)
            {
                s=s.trim();
                n=s.indexOf(' ');
                if(n==-1)
                {
                    n=s.length();
                }
                w=s.substring(0,n);
                s=s.substring(n);
                rev="";
                  for(int i=0;i<w.length();i++)
            {
                char ch=w.charAt(i);
                rev=ch+rev;
            }
            if(rev.equalsIgnoreCase(w))
                System.out.println(w);   
            
            }
     }
}
                