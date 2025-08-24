
 
import java.util.*;
public class Healwell {

    String name, gender;
    int age;
    long mobno;
    String ar[] = {"General Consultation", "Blood Test", "Covid Test", "X-Ray", "CT Scan", "MRI"};
    HashSet<Integer> s = new HashSet<>();
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Gender:");
        gender = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();
        System.out.println("Enter mobile number:");
        mobno = sc.nextLong();
        System.out.println("\t-----Available services-----:");
        System.out.println("\tGeneral Consultation");
        System.out.println("\tBlood Test");
        System.out.println("\tCovid Test");
        System.out.println("\tX-Ray");
        System.out.println("\tCT Scan");
        System.out.println("\tMRI");
        while(true)
        {
            System.out.println("Which services do you want to avail?(to end press 7");
            int a = sc.nextInt();
            if(a !=7)
            {
                s.add(a);
            }
            else
            {
                break;
            }
        }
    }
    void display()
    {
        System.out.println("\t-----Patient Details-----");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("Mobile number: "+ mobno);
        System.out.println("\t-----Availed services-----");
        for(int i : s)
        {
            int a = i;
            System.out.println(ar[i-1]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Healwell ob = new Healwell();
        ob.input();
        ob.display();
    }
    
}
