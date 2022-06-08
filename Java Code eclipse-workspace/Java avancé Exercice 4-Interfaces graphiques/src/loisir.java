public class loisir {
String Nom;
String TempsParSemaine;
String Lieu;
public loisir(String nom, String tempsParSemaine) {
	super();
	Nom = nom;
	TempsParSemaine = tempsParSemaine;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getTempsParSemaine() {
	return TempsParSemaine;
}
public void setTempsParSemaine(String tempsParSemaine) {
	TempsParSemaine = tempsParSemaine;
}
public String getLieu() {
	return Lieu;
}
public void setLieu(String lieu) {
	Lieu = lieu;
}
@Override
public String toString() {
	return "loisir [Nom=" + Nom + ", TempsParSemaine=" + TempsParSemaine + ", Lieu=" + Lieu + "]";
}

}
