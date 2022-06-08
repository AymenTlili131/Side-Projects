import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LirePersonne {
	public void Lire( )throws IOException , ClassNotFoundException
	{
		FileInputStream f=new FileInputStream("personne.ser");
		ObjectInputStream s =new ObjectInputStream(f);
		Personne prest = (Personne) s.readObject();
		s.close();
	}
	void recherche() throws IOException ,ClassNotFoundException
	{
		FileInputStream f = new FileInputStream("personne.ser");
		ObjectInputStream s =new ObjectInputStream(f);
		Personne p=(Personne) s.readObject();
		Personne agee=p;
		while (f.available()>0)
		{
			p=(Personne) s.readObject();
			if(p.age>agee.age) {agee=p;}
		}
		System.out.println("aaaaaaaaaaaaa");
		s.close();
	}
	
}
