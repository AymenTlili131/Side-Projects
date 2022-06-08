import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class Exercice_1 {
	public static void main(String[] args)throws IOException
	{	//Q1
		 String str = "Bonjour le monde";
			try {
				    BufferedWriter writer1 = new BufferedWriter(new FileWriter("src/fichier1.txt"));
				    writer1.write(str);
				    
				    File copied = new File("src/fichier1.txt");
				    try (
				      InputStream in = new BufferedInputStream(
				        new FileInputStream("src/fichier1.txt"));
				      OutputStream out = new BufferedOutputStream(
				        new FileOutputStream("src/fichier2.txt"))) {
				 
				        byte[] buffer = new byte[1024];
				        int lengthRead;
				        while ((lengthRead = in.read(buffer)) > 0) {
				            out.write(buffer, 0, lengthRead);
				            out.flush();
				    writer1.close();
				        }
				    }
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}


//FileWriter fw=new FileWriter("src/Fichier1.txt",true);
//BufferedWriter br = new BufferedWriter(fw);
//br.write("Bonjour le monde");
////close

////fileReader fr= new fileReader("fichier2.txt");
//BufferedReader br2=new BufferedReader(fr);
//String ligne =br2.readline();
//while (ligne != null)
//{br.write(ligne +"\r\n");
//ligne=br2.readLine();
//br.close()