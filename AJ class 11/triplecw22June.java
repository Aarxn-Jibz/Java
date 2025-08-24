/**
 * Accept an array of size n and integer x.Find if there is a triplet x in the array which sums up
 * to the given integer x
 * (triplets
 * e.g.3+4+5(consecutive)=12 so it is a triplet)
 */
    import java.util.Scanner;
    class triplecw22June
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n,x,i,j,sum=0;
            System.out.println("Input x");
            x=sc.nextInt();
            System.out.println("Input number of elements to be inputted in array");
            n=sc.nextInt();
            int ar[]=new int[n];
            System.out.println("Input array elements in ascending order");
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(i=0;i<=n-3;i=i+3)
            {
                sum=ar[i]+ar[i+1]+ar[i+2];
                if(sum==x)
                System.out.println(ar[i]+"+"+ar[i+1]+"+"+ar[i+2]+" is a tripplet");
            }
        }
    }