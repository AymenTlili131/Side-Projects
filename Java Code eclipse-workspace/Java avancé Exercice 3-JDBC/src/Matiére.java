
public class Matiére 
{ int id ;
String Nom;
Float coef;
Enseignant Ens;
public Matiére(int id, String nom, Float coef, Enseignant ens) 
{
	this.id = id;
	Nom = nom;
	this.coef = coef;
	Ens = ens;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public Float getCoef() {
	return coef;
}
public void setCoef(Float coef) {
	this.coef = coef;
}
public Enseignant getEns() {
	return Ens;
}
public void setEns(Enseignant ens) {
	Ens = ens;
}


}
