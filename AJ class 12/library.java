/**Define a class library to perform issue of book and receive books from student. 
 * Another class purchase is derived from it to purchase book for library.
 * 
 * Class library
 * Member data:     bookno as integer
 *                  Bookname as string
 *                  Authorname as string
 *                  Noc (number of copies) as integer
 * Member function:
 *                  library():construtor to initilal values to member data 
 *                  void input(): 
 *                  void display() to display the member data
 *                  void issue() to issue book to the student
 *                  void return_book() to receive book from student
 *class purchase
 *Member data:      price as integer
 *                  N ( number of copies) as integer.
 *Member function
 *                  purchase() constructor to initial values to member data 
 *                  void input()
 *                  void calamount() to calculate amount for the book purchased.
 *                  void update() update number of copies after purchase of book.
 */
import java.util.Scanner;
class library
{
    int bookno,noc;
    String bookName,authorName;
    library()
    {
        
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input book number:");
        bookno=sc.nextInt();
        System.out.println("Input book Name:");
        bookName=sc.nextLine();
        System.out.println("Input Author's name:");
        authorName=sc.nextLine();
        System.out.println("Input number of copies:");
        noc=sc.nextInt();
    }
    void display()
    {
        System.out.println("Book number:"+bookno);
        System.out.println("book Name:"+bookName);
        System.out.println("Author's name:"+authorName);
        System.out.println("Number of copies:"+noc);
    }
    void issue()
    {
        int a,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input book number of book to be issued:");
        a=sc.nextInt();
        if(a==bookno)
        {
            System.out.println("Input number of books to be issued:");
            n=sc.nextInt();
            if(n<=noc)
            {
                noc=noc-n;
            }
            else
            {
                System.out.println("The requested quantity is not in stock!");
            }
        }
        else
        {
            System.out.println("Book number not found:");
        }
    }
    void return_book()
    {
        int a,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input book number of book to be returned:");
        a=sc.nextInt();
        if(a==bookno)
        {
            System.out.println("Input number of books to be returned:");
            n=sc.nextInt();
            noc=noc+n;
        }
        else
        {
            System.out.println("Book number not found:");
        }
    }
}