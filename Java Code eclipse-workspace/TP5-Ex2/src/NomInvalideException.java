public class NomInvalideException  extends Exception
{
	public NomInvalideException()
	{//affichage faciliant la recherche de la cause de l'erreur
		System.out.println("Le nom attribué est peut etre nul");
	}

}
