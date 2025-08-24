/**
 *Define a class to declare a character array of size ten, accept the character
 *into the array and perform the following:
 *Count the number of uppercase letters in the array and print
 *Count the number of vowels in the array and print.
 */
        import java.util.Scanner;
        class Quest3
        {
            public static void main()
            {
                Scanner sc=new Scanner(System.in);
                int i,U,V;char ch;
                ar=new int[10];
                System.out.println("Ennter the characters");
                for (i=0;i<10;i++)
                {
                    multi[i]=sc.nextInt();
                }
                for(i=0;i<10;i++);
                {
                    i=char.charAt[i];
                    if(i>65 && i<90)
                    {
                        U++;
                    }
                    if(i==65 && i==69 && i==73 && i==79 && i==85 && i==97 && i==101 && i==105 && i==111 && i==117)
                    {
                        V++;
                    }
                }
                System.out.println(" The number of vowels are:"+V);
                System.out.println("Number of block letters:"+U);
            }
        }