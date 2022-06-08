
public class Stage {
String Nom;
String Entreprise ;
int duréeMois;
int order ; /*1er ou 2éme stage*/
public Stage(String nom, String entreprise, int duréeMois, int order) {
	super();
	Nom = nom;
	Entreprise = entreprise;
	this.duréeMois = duréeMois;
	assert (order==1 || order ==2);
	this.order = order;
	 
}

}
