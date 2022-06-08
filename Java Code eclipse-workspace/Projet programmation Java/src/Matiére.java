
public class Matiére 
{
	String nom;
	float coef; /*coefficient de la matiére*/
	/*constructeur*/
	public Matiére(String nom, float coef,Centre_formation C) 
	{	this.nom=null;
		try 
		{this.nom=nom;
		for (Matiére m : C.Ensemble_matiéres )
			if ((m.nom).equals(this.nom)) throw new Unique_name_Exception() ;
		}
	catch (Unique_name_Exception e)
	{System.exit(1);}
	if (this.nom!=null)
		{this.coef = coef;}
	}
	/*getter et setters*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getCoef() {
		return coef;
	}
	public void setCoef(float coef) {
		this.coef = coef;
	}
	/*ajouter une matiére*/
	void ajouter_matiére(Centre_formation C)
	{	
		C.Ensemble_matiéres.add(this);
	}
	void supprimer_matiére(Centre_formation C)
	{
		C.Ensemble_matiéres.remove(this);
	}
}
