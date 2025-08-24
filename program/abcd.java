/**accept number having 6 digits and findout the difference between greatest
prime digit and smallest odd digit of the number

n=564238

	greatest prime digit=5
	smallest odd digis=3
	diffence to be print=2

int getmaxdigit(int)	: it retuns greatest prie digit
int getmindigit(int)	: it returns smallest odd digit.
*/
 import java.util.Scanner;
class abcd
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2;
        System.out.println("Enter the number");
        n=sc.nextInt();
        d1=getmaxdigit(n);
        d2=getmindigit(n);
        System.out.println(d1-d2);
    }
    int getmaxdigit(int n)
    {
        int max=0,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            if(r>max && (r==2 || r==3 || r==5 || r==7))
                max=r;
        }
        return max;
    }
    int getmindigit(int n)
    {
        int min=9,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            if(r<min && r%2!=0)
                min=r;
        }
        return min;
    }
}