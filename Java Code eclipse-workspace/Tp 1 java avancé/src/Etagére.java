import java.util.ArrayList;

public class Etag�re 
{ ArrayList<Livre> L_Eta= new ArrayList<Livre>();


public Etag�re() 
{
	super();
}


void ajouterLivre(Livre a)
{ L_Eta.add(a);
	}
void retirerLivre(String a)
{
	for (Livre i :L_Eta)
	 {if (i.titre == a  )
		 L_Eta.remove(i);
	 }
}

void retirerLivre(Livre a)
{ 
	if (L_Eta.contains(a))
		 L_Eta.remove(a);
}

Livre getLivre(int a)
{ return L_Eta.get(a);}

int nombreLivres()
{return L_Eta.size();}

boolean estPresent(Livre L)
{ return L_Eta.contains(L);
	}


@Override
public String toString() {
	return "Etag�re [L_Eta=" + L_Eta + ", nombreLivres()=" + nombreLivres() + "]";
}





}
