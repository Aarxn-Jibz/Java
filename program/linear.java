/**
 * Define a class to declare an integer array of size n and accept the 
 * elements into the array.
 * Search for an element input by the user using linear search technique, 
 * display the element if it is found, otherwise display the message “NO SUCH ELEMENT.
 */
import java.util.Scanner;
class linear
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        int ar[]=new int[n];        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        s=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            if(ar[i]==s)
                c++;
        }
        if(c>0)
            System.out.println("The number exists "+c+" times");
        else 
            System.out.println("NO SUCH ELEMENT");
    }
}