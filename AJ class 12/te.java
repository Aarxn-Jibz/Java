class te
{
    public static void main()
    {
        String s,s2;int c=0,k;
        s="parliament";
        s2="partial men";     
        System.out.println("hello");
        while(s!=s2)
        {
            k=s2.indexOf(' ');
            if(k!=-1)
            {
                s2=s2.substring(0,k)+s2.substring(k+2);
            }
        }
        System.out.println(s2);
    }
}