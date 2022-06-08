import java.util.Scanner;
public class Auteur {
	Scanner keyb;
	String nom;
	Livre tabLivres[]=new Livre[100];
	int nbLivres=0;
	public String getnom()
	{
		System.out.println("le nom de l'auteur est:" + nom);
		return nom;
	}
	public void ajouterLivre(Livre L)
	{nbLivres=0;
	while ((tabLivres[nbLivres]).getTitre() != null)
			{nbLivres++;}
	tabLivres[nbLivres]=L;
	}
	public void afficher()
	{int i=0;
		System.out.println("le nom de l'auteur est:" + nom);
		for (i=0;i<tabLivres.length;i++)
		{System.out.println("le titre #"+ i+1 +" de l'auteur est:" +tabLivres[i].getTitre());}
	}
	public Auteur(String s)
	{
		System.out.println("entrer le nom de l'auteur");
		String nom=keyb.nextLine();
	}
}
