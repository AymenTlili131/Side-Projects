import java.util.ArrayList;

public class Etagére 
{ ArrayList<Livre> L_Eta= new ArrayList<Livre>();


public Etagére() 
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
	return "Etagére [L_Eta=" + L_Eta + ", nombreLivres()=" + nombreLivres() + "]";
}





}
