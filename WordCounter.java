import java.util.*;
import java.io.*;
public class WordCounter
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Text File Name: ");
        String fn = sc.nextLine();
        try
        {
            File f = new File (fn);
            if (!f.exists())
            {
                System.out.print("\nFile Does Not Exist!");
                System.exit(0);
            }
            Scanner fr = new Scanner (f);
            int wc = 0;
            int x = 0;
            char ch;
            System.out.print("\n" + f.length());
            String str = "";
            while (fr.hasNextLine())
            str += fr.nextLine();
            for (int i = 0; i < str.length(); i++)
            {
                ch = str.charAt(i);
                switch (ch)
                {
                    case ',':
                    case ';':
                    case ':':
                    case '.':
                    case '?':
                    case '!':
                        wc++;
                        i++;
                    break;
                    case ' ':
                        wc++;
                    break;
                    default:
                }
            }
            System.out.print("\n\nWord Count of Text = " + wc);
            fr.close();
        }
        catch (IOException ioe)
        {
            System.out.print("\nAn Error Occurred. :(");
            ioe.printStackTrace();
        }
    }
} 
// String for testing: 
// Hello! I am a text file. I am used for testing out the Word Counter used by AR; the code is made in Java with the new-found knowledge of file handling! Indeed, could this work?