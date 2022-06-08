
public class Vendeur extends Commercial
{
	public Vendeur(String nom, String prenom, String date, int age) {
		super(nom, prenom, date, age, age);
	}

	@Override
	public float calculSalaire() {
		return (super.getChiffre()*0.2f)+400;
	}
String getTitre()
{
	return"Vendeur";
}
}
