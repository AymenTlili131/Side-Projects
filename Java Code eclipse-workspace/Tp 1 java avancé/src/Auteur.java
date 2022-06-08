
public class Auteur
{String nom;String prénom;


public Auteur(String nom, String prénom) {

	this.nom = nom;
	this.prénom = prénom;
}


@Override
public String toString() {
	return "Auteur [nom=" + nom + ", prénom=" + prénom + "]";
}


}
