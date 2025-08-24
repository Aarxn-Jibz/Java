/**
 * 2020 Q9
 */
import java.util.Scanner;
class Mix
{
    String wrd;int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first word:");
        wrd=sc.nextLine().toUpperCase();
        len=wrd.length();
    }
    void mix_word(Mix P,Mix Q)
    {
        int c1=0,c2=0,l;
        l=P.wrd.length()+Q.wrd.length();
        while(c1+c2!=l)
        {
            if((c1+c2)%2==0)
            {
                if(c1<P.wrd.length())
                {
                    wrd=wrd+P.wrd.charAt(c1);
                    c1++;
                }
                else
                {
                    wrd=wrd+Q.wrd.charAt(c2);
                    c2++;
                }
            }
            else
            {
                if(c2<Q.wrd.length())
                {
                    wrd=wrd+Q.wrd.charAt(c2);
                    c2++;
                }
                else
                {
                    wrd=wrd+P.wrd.charAt(c1);
                    c1++;
                }
            }
        }
    }
    void display()
    {
        System.out.println("The new word is:"+wrd);
    }
    void main()
    {
        Mix P=new Mix();
        Mix Q=new Mix();
        Mix M=new Mix();
        P.feedword();
        Q.feedword();
        M.mix_word(P,Q);
        M.display();
    }
}