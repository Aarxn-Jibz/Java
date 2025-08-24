/**
 * design a class called set having follwoing details to create the union of two given set
 * class name:          set
 * data members:        ar[],n as integer
 * member methods:
 *                      set(int)
 *                      void input(): to accept n no. of elements in array                      
 *                      void display(): to display the set                      
 *                      boolean isexist(int): it returns true if the received no. is present in the current array else returns false.  
 *                      void union(set,set): it will create the union set of two given set
 */
import java.util.Scanner;
class set
{
    int ar[];int n;
    set(int a)
    {
        n=a;
        ar=new int[n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    void display()
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+ "\t");
        }
        System.out.println();
    }
    boolean isExist(int e)
    {
        for(int i=0;i<n;i++)
        {
            if(ar[i]==e)
                return true;
        }
        return false;
    }
    void intersection(set s1,set s2)
    {
        int k=0,i,j;
        for(i=0;i<s1.n;i++)
        {
            if(isExist(s1.ar[i])==false && s2.isExist(s1.ar[i])==true)
            {
                ar[k++]=s1.ar[i];
            }
        }
        n=k;
    }
    void union(set s1,set s2)
    {
        int k=0,i;
        for(i=0;i<s1.n;i++)
        {
            if(isExist(s1.ar[i])==false)
                ar[k++]=s1.ar[i];
        }
        for(i=0;i<s2.n;i++)
        {
            if(isExist(s2.ar[i])==false)
                ar[k++]=s2.ar[i];
        }
        n=k;
    }
    static void main()
    {
        set s1=new set(3);
        set s2=new set(5);
        System.out.println("Input elements of first array:");
        s1.input();
        System.out.println("Input elements of second array:");
        s2.input();
        set s3=new set(8);
        s3.union(s1,s2);
        System.out.print("The union of sets is:");
        s3.display();
        System.out.println();
        set s4=new set(5);
        s4.intersection(s1,s2);
        System.out.print("The intersection of sets is:");
        s4.display();
    }
}