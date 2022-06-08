
public class Technicien extends Commercial{
	public Technicien(String nom, String prenom, int age, String date,int nbu) {
		super(nom, prenom, date, age, nbu);
		this.nbu=nbu;
		// TODO Auto-generated constructor stub
	}

	public float getNbu() {
		return nbu;
	}

	public void setNbu(float nbu) {
		this.nbu = nbu;
	}

	float nbu;
 String getTitre()
 {return "Technicien";}
	public float calculSalaire()
	{return nbu*5;}
}
