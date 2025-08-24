/**
 * reading text from a text file
 */
import java.util.*;
import java.io.*;
class readT_file
{
    void main()throws IOException
    
    {
        Scanner sc=new Scanner(System.in);
        int n;
        String s;
        FileReader fw=new FileReader("numbers.txt");
        BufferedReader bw=new BufferedReader(fw);
        while((s=bw.readLine())!=null)
        {
            n=Integer.parseInt(s);
            System.out.println(n);
        }
        bw.close();
        fw.close();
    }
}