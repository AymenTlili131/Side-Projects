import java.util.*;
public class projets 
{	String Nom;
	public projets(String nom) {
	super();
	Nom = nom;
}
	ArrayList<compétence> L_compétence =new ArrayList<compétence>();
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public ArrayList<compétence> getL_compétence() {
		return L_compétence;
	}
	public void setL_compétence(ArrayList<compétence> l_compétence) {
		L_compétence = l_compétence;
	}
	void ajouterCompétence(compétence c)
	{
		L_compétence.add(c);
	}
	void retirerCompétence(compétence c)
	{
		L_compétence.remove(c);
	}
}
