/**
 * reading data in a binary file
 */
import java.util.*;
import java.io.*;
class readbinaryfile
{
    void main()throws IOException
    
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int roll;
        double marks;
        FileInputStream fos=new FileInputStream("numbers.dat");
        DataInputStream dos=new DataInputStream(fos);
        while(true)
        {
            try
            {
            name=dos.readUTF();
            roll=dos.readInt();
            marks=dos.readDouble();
            System.out.println(name+"\t"+roll+"\t"+marks);
           }
           catch(EOFException e)
           {
               break;
           }
        }
        dos.close();
        fos.close();
    }
}