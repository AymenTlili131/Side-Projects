
public class Barque {
	public Barque(String a,double b ,String c)
	{
		this.nom=a;this.nAutorisation=b;this.description=c;
	}
	public double getNum()
	{
		return this.nAutorisation;
	}
	public String toString()
	{
		return "nom : "+this.nom+"\n numéro d'autorisation : " +this.nAutorisation +" \n Description: " +this.description+"\n";
	}
	protected String nom;
	protected double nAutorisation;
	protected String description;

}