import java.util.*;
public class projets 
{	String Nom;
	public projets(String nom) {
	super();
	Nom = nom;
}
	ArrayList<comp�tence> L_comp�tence =new ArrayList<comp�tence>();
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public ArrayList<comp�tence> getL_comp�tence() {
		return L_comp�tence;
	}
	public void setL_comp�tence(ArrayList<comp�tence> l_comp�tence) {
		L_comp�tence = l_comp�tence;
	}
	void ajouterComp�tence(comp�tence c)
	{
		L_comp�tence.add(c);
	}
	void retirerComp�tence(comp�tence c)
	{
		L_comp�tence.remove(c);
	}
}
