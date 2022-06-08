import java.io.Serializable;

public class Personne implements Serializable {
	int age;
	String nom;
	String prénom;
	public Personne(String prénom, String nom, int age) {
		this.age = age;
		this.nom = nom;
		this.prénom = prénom;
	}
	@Override
	public String toString() {
		return "Personne [age=" + age + ", nom=" + nom + ", prénom=" + prénom + "]";
	}
	
}
