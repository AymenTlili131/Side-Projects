import java.util.ArrayList;

public class formation extends Centre_formation
{ String nom;
float Dur�e;
float prix ;
ArrayList<Mati�re> Mat_inclue=new ArrayList<Mati�re>();

 
public formation(String nom, float dur�e, float prix,Mati�re M)  throws Unique_name_Exception
/*une formation doit avoir au moins une mati�re qui sera ins�re lors de sa d�claraion*/
	{	this.nom=null;
		try 
		{this.nom=nom;
			for (formation f1 : Liste_formations )
				if ((f1.nom).equals(this.nom)) throw new Unique_name_Exception() ;
		}
		catch (Unique_name_Exception e)
		{System.exit(1);}
		if (this.nom!=null)
		{Liste_formations.add(this);
		this.Dur�e = dur�e;
		this.prix = prix;
		this.Mat_inclue.add(M);}
	}
/*public formation(String nom, float dur�e, float prix,String M)  throws Unique_name_Exception*/
/*une formation doit avoir au moins une mati�re qui sera ins�re lors de sa d�claraion*/
	/*{	this.nom=null;
		try 
		{this.nom=nom;
			for (formation f1 : Liste_formations )
				if ((f1.nom).equals(this.nom)) throw new Unique_name_Exception() ;
		}
		catch (Unique_name_Exception e)
		{System.exit(1);}
		if (this.nom!=null)
		{Liste_formations.add(this);
		this.Dur�e = dur�e;
		this.prix = prix;
		this.Mat_inclue.add(M);}
	}
*/
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public float getDur�e() {
	return Dur�e;
}
public void setDur�e(float dur�e) {
	Dur�e = dur�e;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}



}
