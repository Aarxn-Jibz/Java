// display the sum of two numbers
import java.util.*;
class methods
{
    void main()                             
    {                                       
        Scanner sc=new Scanner(System.in);  
        int a,b;                                      
        System.out.println("Enter two numbers");    
        a=sc.nextInt();                             
        b=sc.nextInt();                             
        fnsum(a,b);               // call statement  a and b are actual parameter
    }                                               
    void fnsum(int x,int y) // x and y are formal parameter
    {     
        int z;              
        z=x+y;              
        System.out.println(z);  
    }                           
}