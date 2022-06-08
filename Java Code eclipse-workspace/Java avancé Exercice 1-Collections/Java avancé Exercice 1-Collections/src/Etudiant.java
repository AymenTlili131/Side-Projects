import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Etudiant {
String Nom;
String prenom;
int CIN;
ArrayList<Matiére> Mat_ins =new ArrayList<Matiére>(); /*un Hashset de matiéres est une idée pareil*/
HashMap<Matiére,Float> Bulletin=new HashMap<Matiére,Float>();



public Etudiant( String a, String b,int c)
{this.Nom=a;this.prenom=b;this.CIN=c;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getCIN() {
	return CIN;
}
public void setCIN(int cIN) {
	CIN = cIN;
}

@SuppressWarnings("resource")
private Float setNote(Matiére m) {
	System.out.println("Veuillez entrer la note de la matiére:"+m.Nom);
	Scanner scanner = new Scanner(System.in);
	float f=scanner.nextFloat();
	return f;
}

void fill_Bulletin()
{
		for (Matiére m : Mat_ins)
			Bulletin.put(m, setNote(m));
	
}
public float calculer_moy()
{float S = 0;float cof_t=0;
Matiére aux0;float aux1;
for (Map.Entry<Matiére,Float> a : Bulletin.entrySet()) 
{ 	aux0=  a.getKey(); 
	aux1=  a.getValue();
   S=S+ aux0.coef * ((float)aux1);
   cof_t=cof_t+ ((Matiére)a.getKey()).coef;
}
return S/cof_t;
}
/*affichage bulletin*/
public void afficher_bulletin()
{
    for (Map.Entry<Matiére,Float> mapentry : this.Bulletin.entrySet()) {
       System.out.println("matiére: "+mapentry.getKey().Nom 
                          + " | note: " + mapentry.getValue());
    }
}
protected void affichage()
{ System.out.println("Nom & prénom de l'étudiant(e)"+this.Nom+" "+this.prenom
		+"\n Cin"+this.CIN/100+"??"); /*pour accéder au Cin complet :utilisez le getter ou l'affichage de la section*/
this.afficher_bulletin();
System.out.println("moyenne"+this.calculer_moy());

}
}
