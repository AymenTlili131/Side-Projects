
public class Personne 
{public String name;public int Age;
	public Personne(String nom,String age) throws AgeInvalideException,NomInvalideException 
	{   //parseInt() permet la conversion de String on entier et on vérifie la containte de l'énoncé
		if ((Integer.parseInt(age)<0)|| (Integer.parseInt(age)>120)) throw new AgeInvalideException(age);
		//création d'une instance de AgeInvalideException si on déborde des bornes
		if (nom==null) throw new NomInvalideException() ;
		//il est important meme si l'exercice ne le spécifie pas de vérifier que la variable 
		//est non nulle avant de la manipuler
		
	this.name=nom;this.Age=Integer.parseInt(age); //le constructeur remplit les attributs
		if (int.class.isInstance(Age)==false) throw new NumberFormatException();
		//test sur le succés de la conversion precedente
	}
//NB:(Integer.parseInt(age) pourrait etre affcté à une variable dés le départ mais un choix personnel est de le reécrir à chaque fois pour en se rappeler
}
// en tout on a 3 exception à controler avec ce constructeur