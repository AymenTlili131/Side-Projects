
public class Habitant {
String Nom;
int cin ;
Commune résidence;
boolean est_président=false;
public Habitant(String nom, int cin, Commune résidence) 
{
	Nom = nom;
	this.cin = cin;
	this.résidence = résidence;
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
public Commune getRésidence() {
	return résidence.nom;
}
public void setRésidence(Commune résidence) {
	this.résidence = résidence;
}
void changer_résidence_C(Commune c)
{ 	if (c!=null)
	this.résidence.retirer_H_C(this);
	this.résidence=c;
	c.ajouter_H_C(this);
	}
void changer_résidence_Ville(Ville V,Commune k)
{
	for (Commune c : V.pop_V.keySet())
	{	
		if (c==this.résidence)
		{	c.retirer_H_C(this);
			this.résidence.V.pop_V.put(c,c.màj_nb_H());
			
			this.résidence.V=V;
			this.changer_résidence_C(k);
			this.résidence.V.pop_V.put(k,k.màj_nb_H());
		}
	}

}
@Override
public String toString() {
	return "Habitant [Nom=" + Nom + ", cin=" + cin + ", résidence=" + résidence + ", est_président=" + est_président
			+ ", getNom()=" + getNom() + ", getCin()=" + getCin() + ", getRésidence()=" + getRésidence() + "]";
}



}
