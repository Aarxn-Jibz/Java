
/**
 *accept a string and check it is palindrome or not.
 * 
 * the string is equal with its reverse.
 * madam,nitin,malayalam 
 */
    import java.util.Scanner;
    class string_palindrome
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            String s,copy,rev="";int n,i;char ch;
            System.out.println("Enter string");
            s=sc.nextLine();
            s=s.trim();
            copy=s;
            n=s.length();
            for(i=0;i<s.length();i++)
            {
                rev=s.charAt(i)+rev;
            }
            if(rev.equalsIgnoreCase(copy)==true)
            {
                System.out.println("Palindrome word");
            }
            else
            {
                System.out.println("Not a palindrome word");
            }
        }
    }