import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Livre 
{String titre;
int isbn;
public Livre(String titre, int isbn) {
	this.titre = titre;
	this.isbn = isbn;
}

Vector<Auteur> L_aut = new Vector<Auteur>() ;

void ajouter_auteur(Auteur A)
{L_aut.add(A);}

void ajouter_auteur(String a, String b)
{ Auteur A = new Auteur(a,b);
L_aut.add(A);}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

void AfficheAuteur()
{ Iterator<Auteur > i = L_aut.iterator()  ;
	while (i.hasNext())
	{
		System.out.println(i.toString());
		i=(Iterator<Auteur>) i.next();
	}

}
void AfficheAuteur2()
{ Enumeration<Auteur> e = L_aut.elements();
	while ( e.hasMoreElements() )
		{System.out.println(e.toString());
		e.nextElement();
		}
}


@Override
public String toString() {
	return "Livre [titre=" + titre + ", isbn=" + isbn + ", L_aut=" + L_aut + "]";
}

boolean egal (Livre unAutreLivre )
{    
	if ( (unAutreLivre.titre==this.titre) & (unAutreLivre.isbn)==(this.isbn) & L_aut.equals(unAutreLivre))
			return true;
	else
		return false;
}
}


