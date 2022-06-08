
public class Personne 
{public String name;public int Age;
	public Personne(String nom,String age) throws AgeInvalideException,NomInvalideException 
	{   //parseInt() permet la conversion de String on entier et on v�rifie la containte de l'�nonc�
		if ((Integer.parseInt(age)<0)|| (Integer.parseInt(age)>120)) throw new AgeInvalideException(age);
		//cr�ation d'une instance de AgeInvalideException si on d�borde des bornes
		if (nom==null) throw new NomInvalideException() ;
		//il est important meme si l'exercice ne le sp�cifie pas de v�rifier que la variable 
		//est non nulle avant de la manipuler
		
	this.name=nom;this.Age=Integer.parseInt(age); //le constructeur remplit les attributs
		if (int.class.isInstance(Age)==false) throw new NumberFormatException();
		//test sur le succ�s de la conversion precedente
	}
//NB:(Integer.parseInt(age) pourrait etre affct� � une variable d�s le d�part mais un choix personnel est de le re�crir � chaque fois pour en se rappeler
}
// en tout on a 3 exception � controler avec ce constructeur