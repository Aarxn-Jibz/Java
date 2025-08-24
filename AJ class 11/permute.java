/**
 * s="cat"
 * permutation of C
 * cat
 * cta
 * permutation of A
 * atc
 * act
 * permutation of t
 * tac
 * tca
 * 
 * 
 */

class permute
{
    void main()
    {
        String s="cat";
        combi(s,"");
    }
    void combi(String s,String t)
    {
        if(s.length()==1)
        {
            System.out.println(s+t);
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                String p=s.substring(0,i)+s.substring(i+1);
                combi(p,t+ch);
            }
        }
    }
}