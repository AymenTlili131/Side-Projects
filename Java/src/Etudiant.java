import java.util.ArrayList;

public class Etudiant extends Participant
{	
	
	int Code_etud;
	String Status;
	
	public Etudiant(double cIN, String nom, String prenom, String date_naissence,Double num,String �ta) 
	{
		super(cIN, nom, prenom, date_naissence);
		this.num_inscri=num;
		this.�tablissement=�ta;
		this.Status="Etudiant";
	} 
	
	Double num_inscri;
	String �tablissement;
	/*ensemble de getters et setters*/
	public Double getNum_inscri() 
    {
		return this.num_inscri;
	}
	public void setNum_inscri(Double num_inscri) {
		this.num_inscri = num_inscri;
	}
	public String get�tablissement() {
		return this.�tablissement;
	}
	public void set�tablissement(String �tablissement) 
	{
		this.�tablissement = �tablissement;
	}
	
	public int Code_etud() {
		return this.Code_etud;}
	
	public float calculer_prix()
	{float remise=0.3f;
		return super.calculer_prix()*(1-this.remise);
	}
}


/*j'ai voulu cr�er un 2�me contructeur qui 
 * prend la premi�re formation de l'etudiant et h�rite celui de participant 
 * mais �a n'ap pas march�
 
public Etudiant (double cIN, String nom, String prenom,
		Date date_naissence, String adresse, formation forma_ins1)
{
	super(cIN, nom, prenom, date_naissence, adresse ,formation forma_ins1 /*le probl�me est l�*/ /*);
}

*/