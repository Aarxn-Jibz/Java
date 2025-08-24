/**
 * Given an integer x, find the square root of x. If x is not a perfect square, then return floor(?x).
 */
import java.util.Scanner;
class sqrt
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double a,sq;
        System.out.println("Input a number");
        a=sc.nextDouble();
        sq=Math.floor(Math.sqrt(a));
        System.out.println(sq);
    }
}