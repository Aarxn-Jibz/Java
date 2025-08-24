/**
 * A class Q1 has been defined to find the prime numbers from a list of data. Some of the functions of the class are given below.
 * Class name : Q1
 * Data Members :
 * Limit : to store an integer limit.
 * Arr[] : integer array of maximum size 150
 * Member methods: :
 * theseries() : constructor to assign 0 to limit and arr[]
 * void readlist() : to accept the limit and input the array arr[] upto the limit.
 * int isprime(int num ,int y): using recursive method check num is prime or not. If prime then the function returns 1 else 0.
 * Void printprimes() : to read integers from the array arr[] and print only prime Integers by invoking int isprime() function upto the limit.
 */
import java.util.Scanner;
class Q1
{                   //opening class
    int limit;int arr[];
    static void main()
    {                   //opening void main
        Q1 ob=new Q1();
        ob.readlist();
        ob.printprimes();
    }                   //closing void main
    Q1()
    {                   //opening constructor
        limit=0;
        arr=new int[150];
    }                   //closing constructor
    void printprimes()
    {                   //opening void printprimes
        int i,k;
        for(i=0;i<limit;i++)
        {                   //opening for loop
            k=isprime(arr[i],1);
            if(k==1)
            {                   //opening if
                System.out.println(arr[i]);
            }                   //closing if
        }                   //closing for loop
    }                   //closing void printprimes
    void readlist()
    {                   //opening void readlist
        Scanner sc=new Scanner(System.in);
        System.out.println("Input limit:");
        limit=sc.nextInt();
        int i;
        System.out.println("Input array elements:");
        for(i=0;i<limit;i++)
        {                   //opening for loop
            arr[i]=sc.nextInt();
        }                   //closing for loop
    }                   
    int isprime(int num,int y)
    {                   //opening int isprime
        if(y<num)
        {                   //opening if
            if(num%y==0 && y!=1)
            {                   //opening if
                return 0;
            }                   //closing if
            else
            {                   //opening else
                return isprime(num,++y);
            }                   //closing else
        }                   //closing if
        return 1;
    }                   //closing int isprime
}                   //closing class