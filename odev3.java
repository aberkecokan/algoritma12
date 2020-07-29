import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
public class odev3 {
	


	
	    public static void main(String args[]) throws IOException
	    {
	        int charCount = 0;
	        int heceCount = 0;
	        int wordCount = -3;
	        int sentenceCount = 0;
	        int lineCount = 0;

	       

	        
	        String filename = "D:/ornek.txt";
	        FileReader myReader = null;
	        int a=3;
	        		
	        try
	        {
	            myReader = new FileReader(filename);
	        }
	        catch (FileNotFoundException e)
	        {
	            System.out.println("Dosya bulunamadi");
	            System.exit(0);
	        }

	        BufferedReader br = new BufferedReader(myReader);
	        String str;

	        while ((str = br.readLine()) != null)
	        {
	            lineCount++;

	            charCount += str.length();

	            for (int i = 0; i < str.length(); i++)
	            {
	                char c = str.charAt(i);

	                str = str.toLowerCase();

	                if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'ý') || (c == 'o') || (c == 'ö') || (c == 'u')
	                        || (c == 'ü'))
	                {
	                    heceCount++;
	                }
	                else if (c == ' ')
	                {
	                    wordCount++;
	                }
	                else if ((c == '!') || (c == '?'))
	                {
	                    sentenceCount++;
	                }
	                else if (c == '.')
	                {
	                    
	                    if (!(str.charAt(i - 1) == '.'))
	                    {
	                        sentenceCount++;
	                    }
	                }
	            }
	        }
			
			myReader.close();
			
	       
	        wordCount += lineCount;

	        System.out.println("Karakter sayisi : " + charCount);
	     
	        System.out.println("Kelime sayisi : " + wordCount);
	       
	        System.out.println("Satir sayisi : " + lineCount);
	    }
	}

