import java.util.HashMap;

public class Ville {
	boolean Capitale =false; 
	float  Surface;
	String nom;


	int Code_postale;
	HashMap<Commune,Integer> pop_V= new HashMap<Commune,Integer>();
	public Ville(String nom, int code_postale) 
	{
		this.nom = nom;
		Code_postale = code_postale;
	}
	public boolean isCapitale() {
		return Capitale;
	}
	public void setCapitale(boolean capitale) {
		Capitale = capitale;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCode_postale() {
		return Code_postale;
	}
	public void setCode_postale(int code_postale) {
		Code_postale = code_postale;
	}
	public HashMap<Commune, Integer> getPop_V() {
		return pop_V;
	}
	public void setPop_V(HashMap<Commune, Integer> pop_V) {
		this.pop_V = pop_V;
	}
	
	int nb_H()
	{	int nb_h=0;
		for (Commune c : pop_V.keySet())
		{
			nb_h=nb_h+c.getNb_H();
		}
		return nb_h;
	}
	
	Habitant recherche_H(int a) /*par cin*/
	{Habitant q = null;
		for (Commune c : pop_V.keySet())
		{if (c.recherche_H(a)!=null);
			q=c.recherche_H(a);}
	return q;
	}
	
	Habitant recherche_H(String a)/*par nom*/
	{Habitant q = null;
	for (Commune c : pop_V.keySet())
	{if (c.recherche_H(a)!=null);
		q=c.recherche_H(a);}
return q;
	}
	
	public float getSurface() {
		return Surface;
	}
	public void setSurface(float surface) {
		for (Commune c : pop_V.keySet())
			Surface = Surface+c.Surface;
	}
	@Override
	public String toString() {
		return "Ville [Capitale=" + Capitale + ", Surface=" + Surface + ", nom=" + nom + ", Code_postale="
				+ Code_postale + ", pop_V=" + pop_V + ", isCapitale()=" + isCapitale() + ", getNom()=" + getNom()
				+ ", getCode_postale()=" + getCode_postale() + ", getPop_V()=" + getPop_V() + ", nb_H()=" + nb_H()
				+ ", getSurface()=" + getSurface() + "]";
	}
	
	
	
}
