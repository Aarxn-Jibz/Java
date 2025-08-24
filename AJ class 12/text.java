/**
 * class name:  text
 * data member: str as string
 * member method:
 *              text(String)
 *              text()
 *              void display(): it will display that string is palindrome or not.
 *              text reverse(): it returns the reverse text of the current text.
 */
class text
{
    String str;
    text()
    {
        str="";
    }
    text(String a)
    {
        str=a;
        
    }
    void getrev(text t)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            t.str=ch+t.str;
        }
    }
    void isplaindrome(text t)
    {
        if(str.equalsIgnoreCase(t.str))
        
            System.out.println("It is palindrome");
       
        else
            System.out.println("It is not a palindrome");
    }
    void display()
    {
        System.out.println(str);
    }
}