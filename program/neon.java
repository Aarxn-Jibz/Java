/**Check if the number is a neon number or not.If sum of the digits of square of the 
 * number is equal to the number.
 */
 import java.util.Scanner;
 class neon                      //opening class
 {
     public static void main()   //opening void main
    {
        Scanner sc=new Scanner (System.in);
        int n,a,i,r,ne=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        i=n;
        a=n*n;
        while (a>0)
        {
            r=a%10;
            a=a/10;
            ne=ne+r;
        }    
        System.out.println(ne);      
        if (ne==i)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
    }           //closing void main
}               //closing class
        
            
        
     