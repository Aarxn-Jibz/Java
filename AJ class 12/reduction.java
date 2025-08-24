/**
 * You are given an array arr of n elements. 
 * In one operation you can pick two indices i and j, such that arr[i] >= arr[j] and replace the value of arr[i] with (arr[i] - arr[j]).
 * You have to minimize the values of the array after performing any number of such operations.
 */
import java.util.Scanner;
class reduction
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,pos,temp=0,pos2,c=0;
        System.out.println("Input size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Input array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        while(true)
        {
            c=0;
            System.out.println("Current array:");
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            for(i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    c++;
                }
            }
            if(c==n-1)
            {
                break;
            }
            pos=0;
            pos2=0;
            for(i=0;i<n;i++)
            {
                if(arr[i]>=arr[pos])
                {
                    pos2=pos;
                    pos=i;
                }
            }
            temp=0;
            if(pos==pos2)
            {
                pos2=1;
                for(i=1;i<n;i++)
                {
                    if(arr[i]>=arr[pos])
                    {
                        temp=pos2;
                        pos2=i;
                    }
                }
            }
            arr[pos]=arr[pos]-arr[pos2];
        }
        System.out.println("The minimised number is:");
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}