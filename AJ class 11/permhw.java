/**
 * accept a multidigit number and display the greatest combination from each room
 * eg:
 *  62493
 *              5 rooms are twenty thousand,thirty thousand,forty thousand,sixty thousand,ninty thousand
 *  26349
 *  23649
 *  23694
 *  .. 24 combi
 *  3
 *  .. 24 combi
 * o/p:
 * 29643
 * 39642
 * ....
 */
import java.util.Scanner;
class permhw
{
    int a=1;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,s2="",c;int a=1,i,j;char temp;
        System.out.println("Input a number");
        s=sc.nextLine();
        for(i=9;i>0;i--)
        {
            for(j=0;j<s.length();j++)
            {
                 if(Character.getNumericValue(s.charAt(j))==i)
                 {
                     s2=s2+s.charAt(j);
                 }
            }
        }
        for(i=1;i<s2.length();i++)
        {
            System.out.println(s2);
            s2=s2.charAt(i)+s2.substring(1,i)+s2.charAt(0)+s2.substring(i+1);
        }
        System.out.println(s2);
    }
}