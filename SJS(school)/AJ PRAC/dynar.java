class dynar
{
    int count,size;
    int ar[];
    dynar()
    {
        count=0;
        size=1;
        ar=new int[size];
    }
    void growSize()
    {
        if(count==size)
        {
            int temp[]=new int[size*2];
            for(int i=0;i<count;i++)
            {
                temp[i]=ar[i];
            }
            ar=temp;
        }
    }
    void addAt(int index,int data)
    {
        if(count==size)
        {
            growSize();
        }
        for(int i=count-1;i>=index;i--)
        {
            ar[i+1]=ar[i];
        }
        ar[index]=data;
        count++;
    }
    void removeAt(int index)
    {
        for(int i=index;i<count;i++)
        {
            ar[i]=ar[i+1];
        }
        ar[count-1]=0;
        count--;
    }
}