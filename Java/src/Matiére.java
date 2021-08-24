
public class Mati�re 
{
	String nom;
	float coef; /*coefficient de la mati�re*/
	/*constructeur*/
	public Mati�re(String nom, float coef,Centre_formation C) 
	{	this.nom=null;
		try 
		{this.nom=nom;
		for (Mati�re m : C.Ensemble_mati�res )
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
	/*ajouter une mati�re*/
	void ajouter_mati�re(Centre_formation C)
	{	
		C.Ensemble_mati�res.add(this);
	}
	void supprimer_mati�re(Centre_formation C)
	{
		C.Ensemble_mati�res.remove(this);
	}
}
