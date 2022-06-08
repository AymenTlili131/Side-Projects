
public abstract class Employe {
String nom;String prenom;String Date;int age;

public Employe(String nom, String prenom, String date, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.Date = date;
	this.age = age;
}
String getTitre()
{return "Employe";}
String getNom()
{return getTitre()+nom+prenom;}
public abstract float calculSalaire();



}
