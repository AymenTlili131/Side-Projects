
class Temps
{
//Attributs
private int heures, minutes, secondes;

//Constructeur
public Temps(int h, int m, int s) throws TempsException
{ //les formats d'un temps invalide qui déclenche TempsException
	if ((h>23)||(m>59)||(s>59)||(s<0)||(m<0)||(h<0)) throw new TempsException();
	//affectation
  heures = h; minutes = m; secondes = s;

 //l'énoncé ne déclare pas comment traiter une mauvaise construction sauf le s.o.p	  
}
//fonction optionnelle pour visualiser le résultat
public void affiche()
{
	if (this != null)
			System.out.println(heures+":"+minutes+":"+secondes+"\n");}
}
