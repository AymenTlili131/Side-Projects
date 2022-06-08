import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Biblio 
{
	HashMap<String,Etag�re> H=new HashMap<String,Etag�re>() ;

	public Biblio()
	{
		/*Set s =new Set ---- qui contiendra les String noms des �tag�res haute & milieu & basse ;
		s.add("haute");s.add("milieu");s.add("basse");*/
		Etag�re a = new Etag�re();Etag�re b =new Etag�re();Etag�re c =new Etag�re();
		H.keySet();
		H.put("haute", a);
		H.put("milieu", b);
		H.put("basse", c);
	}

	void ajouterLivre(String niveau ,Livre unLivre )
	{
		if (niveau.equals("haute"))
		{  Etag�re e = H.get(niveau);
			e.ajouterLivre(unLivre);;
			H.put(niveau, e );}
		if (niveau.equals("milieu"))
		{  Etag�re e = H.get(niveau);
		e.ajouterLivre(unLivre);;
		H.put(niveau, e );}
		if (niveau.equals("basse"))
		{  Etag�re e = H.get(niveau);
		e.ajouterLivre(unLivre);;
		H.put(niveau, e );}
		
	}

	
	void retirerLivre( Livre unLivre)
	{Etag�re e = null;
		for (Etag�re x :H.values())
		if (x.L_Eta.contains(unLivre))
		{
			for (String s : H.keySet())
				{
				if( H.get(s).L_Eta.contains(unLivre))
					 {e = (Etag�re) H.get(s);
					 e.retirerLivre(unLivre);
					 H.put(s, e );}
				}
		}	
	}
	
	void retirerLivre( String niveau ,String titre)
	{	Etag�re found = null;
		for (Etag�re x :H.values())
			for (Livre l :x.L_Eta)
			{if (l.titre.equals(titre))
				found = x;
				found.retirerLivre(l);
				for (String s : H.keySet())
					{
					if( H.get(s) == x)
					{
						H.put(s, found );
					}
					}
			}
	}
	
	
	int nombreLivres()
	{int s=0;
		for (Etag�re x :H.values())
		{s=s+x.nombreLivres();
		}
	return s;
	}
	
	boolean estPresent( Livre unlivre)
	{ boolean result=false;
		for (Etag�re x :H.values())
			if (x.estPresent(unlivre))
				result=true;
		return result;
		
		
	}

	@Override
	public String toString() {
		return "Biblio [H=" + H + ", nombreLivres()=" + nombreLivres() + "]";
	}
	
}
