
public class TempsException extends Throwable 
{
public TempsException() 
{
	System.out.println("\n \t Erreur lors de la cr�ation du Temps \n");
}
}
/*message d'erreur sp�cifique � chaque attribut
if (heures>23)
	  System.out.println("nombre d'heures invalide ");
if (minutes>59)
	  System.out.println("nombre de minutes invalide ");
if (secondes>59)
	  System.out.println("nombre de secondes invalide ");
if (secondes<0)
	  System.out.println("le nombre de seconde doit etre un entier positif ");
if (minutes<0)
	  System.out.println("le nombre de minute doit etre un entier positif ");
if (heures<0)
	  System.out.println("le nombre d'heures doit etre un entier positif ");*/