
public class Manutention extends Commercial
{

	public Manutention(String nom, String prenom, int age, String date,int nbh) 
	{
		super(nom, prenom, date, age, nbh);
		this.nbh=nbh;
	}
	public float getNbh() {
		return nbh;
	}
	public void setNbh(float nbh) 
	{
		this.nbh = nbh;
	}
	float nbh;
 String getTitre()
 {return "Manutention";}
public float calculSalaire()
	{return nbh*65;}
}
