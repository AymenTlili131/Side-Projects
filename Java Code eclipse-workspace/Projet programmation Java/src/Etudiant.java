import java.util.ArrayList;

public class Etudiant extends Participant
{	
	
	int Code_etud;
	String Status;
	
	public Etudiant(double cIN, String nom, String prenom, String date_naissence,Double num,String éta) 
	{
		super(cIN, nom, prenom, date_naissence);
		this.num_inscri=num;
		this.établissement=éta;
		this.Status="Etudiant";
	} 
	
	Double num_inscri;
	String établissement;
	/*ensemble de getters et setters*/
	public Double getNum_inscri() 
    {
		return this.num_inscri;
	}
	public void setNum_inscri(Double num_inscri) {
		this.num_inscri = num_inscri;
	}
	public String getÉtablissement() {
		return this.établissement;
	}
	public void setÉtablissement(String établissement) 
	{
		this.établissement = établissement;
	}
	
	public int Code_etud() {
		return this.Code_etud;}
	
	public float calculer_prix()
	{float remise=0.3f;
		return super.calculer_prix()*(1-this.remise);
	}
}


/*j'ai voulu créer un 2éme contructeur qui 
 * prend la premiére formation de l'etudiant et hérite celui de participant 
 * mais ça n'ap pas marché
 
public Etudiant (double cIN, String nom, String prenom,
		Date date_naissence, String adresse, formation forma_ins1)
{
	super(cIN, nom, prenom, date_naissence, adresse ,formation forma_ins1 /*le probléme est là*/ /*);
}

*/