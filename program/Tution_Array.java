/**
 * Declare an array with n blocks and accept 5 elements in the array (assume n>5)
 * also accept a single value and the position to insert that value at given position.
 * where position must be within 5.
 */
    import java.util.Scanner;
    
    class Tution_Array
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n,i,a,val,pos;
            System.out.println("Enter number of elements in array(greater than 5)");
            n=sc.nextInt();
            int ar[]=new int [n];
            System.out.println("Input 5 elements");
            for(i=0;i<5;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println("Input a value");
            val=sc.nextInt();
            System.out.println("Input the position");
            pos=sc.nextInt();
            for(i=n-2;i>=pos;i--)
            {
                ar[i+1]=ar[i];
            }
            ar[pos]=val;
            for(i=0;i<n;i++)
            {
                System.out.println(ar[i]);
            }
        }
    }