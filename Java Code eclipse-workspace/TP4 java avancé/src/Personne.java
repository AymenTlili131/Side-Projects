import java.io.Serializable;

public class Personne implements Serializable {
	int age;
	String nom;
	String pr�nom;
	public Personne(String pr�nom, String nom, int age) {
		this.age = age;
		this.nom = nom;
		this.pr�nom = pr�nom;
	}
	@Override
	public String toString() {
		return "Personne [age=" + age + ", nom=" + nom + ", pr�nom=" + pr�nom + "]";
	}
	
}
