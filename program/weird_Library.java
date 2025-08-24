/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   import java.util.Scanner;
   class weird_Library
   {
       int acc_num;String title,author;
       void input()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Input accession number");
           acc_num=sc.nextInt();
           title=sc.nextLine();
           sc.nextLine();
           author=sc.nextLine();
           sc.nextLine();
           sc.nextLine();
       }
       void compute()
       {
           Scanner sc=new Scanner(System.in);
           int days,fine;
           System.out.println("Input number of days:");
           days=sc.nextInt();
           fine=days*2;
       }
       void display()
       {
           System.out.println("Accession number:"+acc_num);
           System.out.println("Title:"+title);
           System.out.println("Author:"+author);
       }
       public static void main()
       {
           weird_Library ob=new weird_Library();
           ob.input();
           ob.compute();
           ob.display();
       }
   }