/**
 * // accept 10 integers in an array and display all the 
//even numbers are present in it.
*/
 import java.util.*;
class array
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            if (ar[i]%2==0)
            {
               System.out.println(ar[i]);
            }
        }
    }
}