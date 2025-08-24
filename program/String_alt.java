/**
 * convert all the uppercase to lowercase and vice versa. 
 * finally print the updated string.
 */
     import java.util.Scanner;
     class String_alt
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                String s,a="";int i;char ch;
                System.out.println("Enter string");
                s=sc.nextLine();
                for(i=0;i<s.length();i++)
                {
                    ch=s.charAt(i);
                    {
                        if(ch>=65 && ch<=90)
                        {
                            ch=(char)(ch+32);
                        }
                        else
                        {
                            ch=(char)(ch-32);
                        }
                        a=a+ch;
                    }
                    System.out.println(a);
                }
            }
        }
                     