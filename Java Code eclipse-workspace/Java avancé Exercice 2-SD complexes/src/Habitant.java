
public class Habitant {
String Nom;
int cin ;
Commune r�sidence;
boolean est_pr�sident=false;
public Habitant(String nom, int cin, Commune r�sidence) 
{
	Nom = nom;
	this.cin = cin;
	this.r�sidence = r�sidence;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public int getCin() {
	return cin;
}
public void setCin(int cin) {
	this.cin = cin;
}
public Commune getR�sidence() {
	return r�sidence.nom;
}
public void setR�sidence(Commune r�sidence) {
	this.r�sidence = r�sidence;
}
void changer_r�sidence_C(Commune c)
{ 	if (c!=null)
	this.r�sidence.retirer_H_C(this);
	this.r�sidence=c;
	c.ajouter_H_C(this);
	}
void changer_r�sidence_Ville(Ville V,Commune k)
{
	for (Commune c : V.pop_V.keySet())
	{	
		if (c==this.r�sidence)
		{	c.retirer_H_C(this);
			this.r�sidence.V.pop_V.put(c,c.m�j_nb_H());
			
			this.r�sidence.V=V;
			this.changer_r�sidence_C(k);
			this.r�sidence.V.pop_V.put(k,k.m�j_nb_H());
		}
	}

}
@Override
public String toString() {
	return "Habitant [Nom=" + Nom + ", cin=" + cin + ", r�sidence=" + r�sidence + ", est_pr�sident=" + est_pr�sident
			+ ", getNom()=" + getNom() + ", getCin()=" + getCin() + ", getR�sidence()=" + getR�sidence() + "]";
}



}
