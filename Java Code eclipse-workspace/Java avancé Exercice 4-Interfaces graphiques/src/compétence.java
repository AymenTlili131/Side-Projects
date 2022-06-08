
public class compétence {
	String Nom;
	int MoisExperience;
	String type;
	public compétence(String nom, int moisExperience, String valeur) {
		super();
		Nom = nom;
		MoisExperience = moisExperience;
		this.type = valeur;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getMoisExperience() {
		return MoisExperience;
	}
	public void setMoisExperience(int moisExperience) {
		MoisExperience = moisExperience;
	}
	public String gettype() {
		return type;
	}
	public void settype(String valeur) {
		this.type = valeur;
	}
	
	
}
