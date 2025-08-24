
class test6
{
    void main()
    {
        factor_count(1,10,0);
    }
    void factor_count(int i,int n,int c)
    {
      if(i<=n)
       {
          if(n%i==0)
            c++;
          factor_count(i+1,n,c);
       }
       else
        System.out.println(c);
    }
}