
public abstract class Commercial extends Employe {
	float chiffre;

	public Commercial(String nom, String prenom, String date, int age, float chiffre) {
		super(nom, prenom, date, age);
		this.chiffre = chiffre;
	}

	public float getChiffre() {
		return chiffre;
	}

	public void setChiffre(float chiffre) {
		this.chiffre = chiffre;
	}
	

}