/**
 * *Member function
 *                  purchase() constructor to initial values to member data 
 *                  void input()
 *                  void calamount() to calculate amount for the book purchased.
 *                  void update() update number of copies after purchase of book.
 */
import java.util.Scanner;
class purchase extends library
{
    int price,N;
    purchase()
    {
        
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Input book number:");
        a=sc.nextInt();
        if(a==bookno)
        {
            System.out.println("Input number of books:");
            N=sc.nextInt();
            System.out.println("Input price of each copy:");
            price=sc.nextInt();
        }
        else
        {
            System.out.println("Book not found:");
        }
    }
    void calamount()
    {
        price=price*N;
    }
    void update()
    {
        noc=noc+N;
    }
}