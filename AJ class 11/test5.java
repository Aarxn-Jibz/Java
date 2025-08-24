/**
 * display first n natural numbers
 * 
 * for(int i=1;i<=n;i++)
 *  sopln(i);
 *  
 * while(n>=1)
 * {
 *     sopln(n);
 *     n--;
 *     
 * }
 * */
 class test5
 {
void main()
{
fun(1,10);
System.out.println("2nd method");
fun(10);
}

void fun(int i,int n)          
{
    if(i<=n)
   {
       System.out.println(i);
       fun(i+1,n);
   }
}

void fun(int n)
{
  if(n>=1)
   {
      System.out.println(n);
      fun(n-1);
      System.out.println(n);
   }
}
}