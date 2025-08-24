
/**
 *display each word  from a sentencce along with its no. of characters
 */
        import java.util.Scanner;
        class question20
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                String s,w,s1;
                int a,n;
                System.out.println("Enter the sentence");
                s=sc.nextLine();
                s1=s;        
                while(s.length()>0)
                {
                    s=s.trim();
                    n=s.indexOf(' ');
                    if(n==-1)
                    n=s.length();
                    w=s.substring(0,n);
                    s=s.substring(n);
                    System.out.println(w);
                    a=s.length();
                    System.out.println(a);
                }
            }
        }
                