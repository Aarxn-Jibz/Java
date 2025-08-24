class Solution {
    static void main(){
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            System.out.println("Before:");
            for(int k=0;k<nums.length;k++)
            {
                System.out.print(nums[k]);
            }
            System.out.println(nums[i]);
            if(nums[i]==nums[i-1])
            {
                for(int j=i;j<nums.length;j++)
                {
                    if(j==nums.length-1)
                    {
                        continue;
                    }
                    else
                    {
                        nums[j]=nums[j+1];
                    }
                }
            }
            else
            {
                c++;
            }
            System.out.println("C="+c);
            System.out.println("After:");
            for(int k=0;k<nums.length;k++)
            {
                System.out.print(nums[k]);
            }
            System.out.println();
        }
        //return c;
    }
}