import java.util.HashSet;

public class Commune {
	public Commune nom;
	int nb_H=0;
	float  Surface;
	public float getSurface() {
		return Surface;
	}

	public void setSurface(float surface) {
		Surface = surface;
	}

	HashSet<Habitant> pop_C = new HashSet<Habitant>();
	Ville V=null;
	public Commune(Commune nom, int nb_H, Ville v) 
	{
		this.nom = nom;
		this.nb_H = nb_H;
		V = v;
	}
	
	void ajouter_H_C(Habitant H)
	{
		if (H!=null)
			pop_C.add(H);
		H.résidence=this;
	}
	void retirer_H_C(Habitant H)
	{
		if ((H!=null) & pop_C.contains(H))
			pop_C.remove(H);
	}
	
	int màj_nb_H() 
	{
		return pop_C.size();
	}
	
	Habitant recherche_H(int a) /*par cin*/
	{Habitant aux=null;
		for (Habitant h : pop_C)
		if (h.cin==a)
			aux=h;
		return aux;
	}
	
	Habitant recherche_H(String a)/*par nom*/
	{Habitant aux=null;
	for (Habitant h : pop_C)
	if (h.Nom.equals(a))
		aux=h;
	return aux;
	}

	public Commune getNom() {
		return nom;
	}

	public void setNom(Commune nom) {
		this.nom = nom;
	}

	public int getNb_H() {
		return nb_H;
	}

	public void setNb_H(int nb_H) {
		this.nb_H = nb_H;
	}

	public HashSet<Habitant> getPop_C() {
		return pop_C;
	}

	public void setPop_C(HashSet<Habitant> pop_C) {
		this.pop_C = pop_C;
	}

	public Ville getV() {
		return V;
	}

	public void setV(Ville v) {
		V = v;
	}

	@Override
	public String toString() {
		return "Commune [nom=" + nom + ", nb_H=" + nb_H + ", Surface=" + Surface + ", pop_C=" + pop_C + ", V=" + V
				+ ", getSurface()=" + getSurface() + ", màj_nb_H()=" + màj_nb_H() + ", getNom()=" + getNom()
				+ ", getNb_H()=" + getNb_H() + ", getPop_C()=" + getPop_C() + ", getV()=" + getV() + "]";
	}
	
	
}
