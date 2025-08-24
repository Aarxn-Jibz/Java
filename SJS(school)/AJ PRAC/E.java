class E
{
    public static void main()
    {
        int nums[]={1,2,3,1};
        for(int i=0; i<nums.length;i++)
        {
            boolean in=false;
            for(int j=i; j< nums.length-1; j++)
            {
                System.out.println(in);
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    in=true;
                }
            }
            System.out.println(in);
            if(in==false)
            {
                System.out.println("Check");
                break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                System.out.println("true");
                System.exit(0);
            }
            
        }
        System.out.println("false");
    }
}