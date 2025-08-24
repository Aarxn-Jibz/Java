import java.util.Scanner;
class Mix
{
    String wrd; int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feed_word()
    {
        Scanner sc=new Scanner(System.in);
        wrd=sc.nextLine();
        len=wrd.length();
    }
    void mix_word(Mix P, Mix Q)
    {
        int c=0,c1=0,c2=0;
        while(c<P.len+Q.len)
        {
            if(c%2==0)
            {
                wrd=wrd+P.wrd.charAt(c1);
                c++;
                c1++;
            }
            else if(c%2!=0)
            {
                wrd=wrd+Q.wrd.charAt(c2);
                c++;
                c2++;
                
            }
            if(c1==P.len && c2!=Q.len)
            {
                wrd=wrd+Q.wrd.substring(c2);
                break;
            }
            else if(c2==Q.len && c1!=P.len)
            {
                wrd=wrd+P.wrd.substring(c1);
                break;
            }
        }
        len=wrd.length();
    }
    void display()
    {
        System.out.println(wrd);
    }
}