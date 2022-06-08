
public class ExecuteBiblio 
{
	public static void main(String[] args )
	{
		Auteur A =new Auteur("ahmed","A");
Auteur B =new Auteur("amid","B");
Auteur C =new Auteur("Pierre","C");

Biblio Bib=new Biblio();
Etagére Hau=new Etagére();
Etagére Mil=new Etagére();
Etagére Bas=new Etagére();

Livre L1=new Livre ("war and peace",14);
Auteur LT=new Auteur("Léon" ,"Tolstoï");
L1.ajouter_auteur(LT);
Livre L2=new Livre ("Fahrenheit 451",20);
Livre L3=new Livre ("Love in the time of Cholera",74);
Livre L4=new Livre ("Quran",30);


Bib.ajouterLivre("haute", L4);
Bib.ajouterLivre("milieu", L3);
Bib.ajouterLivre("basse", L2);
Bib.ajouterLivre("basse", L1);
System.out.println(Bib.toString());
Bib.retirerLivre(L1);
System.out.println(Bib.toString());
}
}
