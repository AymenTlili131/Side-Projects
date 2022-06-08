import java.util.ArrayList;

public class Pays 
{	String nom;
	float  Surface;
	Habitant Président;
	int Population=0;
	boolean en_guerre=false;
	float reserve_national;
	ArrayList<Ville> pop_P = new ArrayList<Ville>();
	Ville return_capitale()
	{	int max=0;
		Ville a=null;
		for (Ville v : pop_P)
		{
			if (v.Capitale==true)
			{	a=v;
					return v;}
		else 
			{
			if (v.nb_H()>max) /*ville avec plus d'habitant est la capitale*/
			 {max=v.nb_H();a=v;
			 }
			}
		}
		for (Ville v : pop_P)
		{if (v==a)
			v.Capitale=true;
		return v;}
		return a;
		
	}
	public Pays(String nom, Habitant président, boolean en_guerre, float reserve_national) 
	{
		this.nom = nom;
		Président = président;
		this.en_guerre = en_guerre;
		this.reserve_national = reserve_national;
	}
	
	void ajouter_V(Ville V)
	{
		pop_P.add(V);
	}
	void retirer_V(Ville V)
	{if (en_guerre==true)
		pop_P.remove(V);
	}
	
	int population()
	{for( Ville v : pop_P)
		Population=Population+v.nb_H();
	return Population;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getSurface() {
		return Surface;
	}
	public void setSurface(float surface) {
		Surface = surface;
	}
	public Habitant getPrésident() {
		return Président;
	}
	public void setPrésident(Habitant président) {
		Président = président;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	public boolean isEn_guerre() {
		return en_guerre;
	}
	public void setEn_guerre(boolean en_guerre) {
		this.en_guerre = en_guerre;
	}
	public float getReserve_national() {
		return reserve_national;
	}
	public void setReserve_national(float reserve_national) {
		this.reserve_national = reserve_national;
	}
	public float getSurface2() {
		return Surface;
	}

	public void setSurface2(float surface) {
		for (Ville v : pop_P)
			Surface = Surface+v.getSurface();
	}
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", Surface=" + Surface + ", Président=" + Président + ", Population=" + Population
				+ ", en_guerre=" + en_guerre + ", reserve_national=" + reserve_national + ", pop_P=" + pop_P + "]";
	}

	
	
	
}
