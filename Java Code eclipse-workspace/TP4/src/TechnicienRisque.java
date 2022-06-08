
public class TechnicienRisque extends Technicien implements aRisque{

	public TechnicienRisque(String nom, String prenom, int age, String date,int nbu) {
		super(nom, prenom, age, date,nbu);
		// TODO Auto-generated constructor stub
	}
public float calculsalaire()
{return super.calculSalaire()+aRisque.prime;
}
}
