
public class Auteur
{String nom;String pr�nom;


public Auteur(String nom, String pr�nom) {

	this.nom = nom;
	this.pr�nom = pr�nom;
}


@Override
public String toString() {
	return "Auteur [nom=" + nom + ", pr�nom=" + pr�nom + "]";
}


}
