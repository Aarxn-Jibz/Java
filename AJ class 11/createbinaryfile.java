/**
 * writting data in a binary file
 */
import java.util.*;
import java.io.*;
class createbinaryfile
{
    void main()throws IOException
    
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int roll;
        double marks;
        FileOutputStream fos=new FileOutputStream("numbers.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter name,rioll,mrk");
            name=sc.next();
            roll=sc.nextInt();
            marks=sc.nextDouble();
            dos.writeUTF(name);
            dos.writeInt(roll);
            dos.writeDouble(marks);
        }
        dos.close();
        fos.close();
    }
}