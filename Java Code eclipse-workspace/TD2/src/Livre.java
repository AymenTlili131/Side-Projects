import java.util.Scanner;
public class Livre 
{
 private Scanner keyb=new Scanner(System.in);
 private String titre;
 private Auteur tabAuteur[];
 public String getTitre()
	{System.out.println("entrer le titre à vérifier");
	String titre=keyb.nextLine();
	String s="le titre du livre :"+titre
			+"son premier auteur"+getPremierAuteur(()) +"suivie par"+getAuteurs()  ;
	return s;} /*il y aura répition du nom du premier auteur dans l'affichage */
public String getPremierAuteur()
	{System.out.println(tabAuteur[0]);
	return tabAuteur[0].nom;
	}
public String getAuteurs()
	{for(int i=0;i<tabAuteur.length;i++)
		System.out.println(tabAuteur[i]);
	return /**/;
	}
public Livre(String s , []Auteur)
	{
	livre.titre=s;
	for (int i=1;i<Auteur.length;i++)
		livre.tabAuteur[i]=Auteur[i];
	for (int i=0;i<Auteur.length;i++)
		tabAuteur[i]=ajouterLivre(L);
		/*ajouter this*/
	}
}

