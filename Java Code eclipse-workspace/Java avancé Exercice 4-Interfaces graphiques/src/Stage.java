
public class Stage {
String Nom;
String Entreprise ;
int dur�eMois;
int order ; /*1er ou 2�me stage*/
public Stage(String nom, String entreprise, int dur�eMois, int order) {
	super();
	Nom = nom;
	Entreprise = entreprise;
	this.dur�eMois = dur�eMois;
	assert (order==1 || order ==2);
	this.order = order;
	 
}

}
