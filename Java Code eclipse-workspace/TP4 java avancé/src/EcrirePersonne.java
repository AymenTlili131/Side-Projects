import java.io.FileOutputStream;
import java.io.*;
public class EcrirePersonne {

	ObjectOutputStream s;
	FileOutputStream f;
	
	public EcrirePersonne()throws IOException
	{
		f = new FileOutputStream("personne.ser"); //meuilleur temps d'acc�s .doc .txt
		s=new ObjectOutputStream(f);
	}

	public void ecrire(Personne p) throws IOException
	{
		s.writeObject(p);
	}
}
//file Object stream
// 