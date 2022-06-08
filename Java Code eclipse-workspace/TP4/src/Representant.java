
public class Representant extends Commercial
{
	public Representant(String nom, String prenom, String date, int age) {
		super(nom, prenom, date, age, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float calculSalaire() 
	{
		return (super.getChiffre()*0.2f)+800;
	}
String getTitre()
{
	return"Representant";
}


}
