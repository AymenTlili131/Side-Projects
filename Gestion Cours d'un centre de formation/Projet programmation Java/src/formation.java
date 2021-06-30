import java.util.ArrayList;

public class formation extends Centre_formation
{ String nom;
float Durée;
float prix ;
ArrayList<Matiére> Mat_inclue=new ArrayList<Matiére>();

 
public formation(String nom, float durée, float prix,Matiére M)  throws Unique_name_Exception
/*une formation doit avoir au moins une matiére qui sera insére lors de sa déclaraion*/
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
		this.Durée = durée;
		this.prix = prix;
		this.Mat_inclue.add(M);}
	}
/*public formation(String nom, float durée, float prix,String M)  throws Unique_name_Exception*/
/*une formation doit avoir au moins une matiére qui sera insére lors de sa déclaraion*/
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
		this.Durée = durée;
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
public float getDurée() {
	return Durée;
}
public void setDurée(float durée) {
	Durée = durée;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}



}
