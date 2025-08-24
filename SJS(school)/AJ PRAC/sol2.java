import java.util.Scanner;
class sol2
{
    static void main()
    {
        int c=1,i,j,k,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Array:");
        for(i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(i=0;i<nums.length-1;i++)
        {
            System.out.println();
            System.out.println("I="+i+"   NUms[i]="+nums[i]+"   nums[i+1]="+nums[i+1]);
            System.out.println("BEFORE");
            for(k=0;k<nums.length;k++)
            {
                System.out.print(nums[k]+"\t");
            }
            System.out.println();
            if(nums[i]==nums[i+1])
            {
                for(j=i+1;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                }
            }
            else if(nums[i]==nums[i-1])
            {
                for(j=i;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                }
            }
            System.out.println("AFTER");
            System.out.println("c="+c);
            for(k=0;k<nums.length;k++)
            {
                System.out.print(nums[k]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}