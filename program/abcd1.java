/**
 *accept a string and count
 * no. of vowel,consonats,upper case,lower case, alphabets,digits and white space
 * are present in the string. 
 */
        import java.util.Scanner;
        class abcd1
        
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                String s;int i,v=0,c=0,U=0,l=0,a=0,d=0,s=0;char ch;
                System.out.println("Enter string");
                s=sc.nextLine();
                for(i=0;i<=s.length();i++)
                {
                    ch=s.charAt(i);
                    if (ch=0)
                    {
                        s++;
                    }
                    else if(ch>=48 && ch<=57)
                    {
                        d++;
                    }
                    else if(ch>=65 && ch<=90)
                    {
                        a++;
                        U++;
                        if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85)
                        {
                            v++;
                        }
                        else 
                        {
                            c++;
                        }
                    }
                    else if(ch>=97 && ch<=122)
                    {
                        a++;
                        l++;
                        if(ch==97 && ch==101 && ch==105 && ch==111 && ch==117)
                        {
                            v++;
                        }
                        else
                        {
                            c++;
                        }
                    }
                    else if(ch>=48 && ch<=57)
                    {
                        d++;
                    }
                }
            }
        }
                