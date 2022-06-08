

import java.io.*;
public class FileEx
{
public static void main(String[] args)
{
	    try
	    {
	      /* Le fichier d'entrée*/
	      File file = new File("file.txt");    
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(file);  
	      // Créer l'objet BufferedReader        
	      BufferedReader br = new BufferedReader(fr);  
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	        // ajoute la ligne au buffer
	        String[]s =sb.split("|");      
	        System.out.println(s.toString());
	      } 
	      System.out.println("Contenu du fichier: ---------------");
	      System.out.println(sb.toString());  
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	  }
}
