import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Participant implements noté ,payer
{	
String Status= "Participant";

double CIN;
String nom;
String prenom;
String date_naissence;
ArrayList<String> Adresse=new ArrayList<String>();
ArrayList<formation> Lforma_ins=new ArrayList<formation>() ;
HashMap<Matiére,Float> Bulletin=new HashMap<Matiére,Float>();/*refrence type not wrapper*/
/*j'ai voulu faire 2 constructeurs, l'un prend la premiére formation comme paramétre*/
	public Participant(double cIN, String nom, String prenom, Date date_naissence, String adresse) 
	{
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissence = date_naissence;
		Adresse[0] = adresse;
	}
	
	public Participant(double cIN, String nom, String prenom,
			String date_naissence) {
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissence = date_naissence;
	}
/*getters et setters des attributs simples*/
	public double getCIN() {
		return CIN;
	}
	public void setCIN(double cIN) 
	{
		CIN = cIN;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_naissence() {
		return date_naissence;
	}
	public void setDate_naissence(String date_naissence) 
	{
		this.date_naissence = date_naissence;
	}
/*ajouter les adresses*/
	void ajouter_adresse(String s)
	{ 			this.Adresse.add(s);
	}
/*supprimer les adresses*/
	void supprimer_adresse(String s)	
	{ArrayList<String> aux= null ;
		for(int i=0;i<this.Adresse.size();i++)
			{if (this.Adresse.get(i)==s)
				continue;
			aux.add(this.Adresse.get(i));}
		this.Adresse=aux;
	}
/*ajouter les formation*/
	void ajouter_formation(formation f,Centre_formation C)
	{ 	
		this.Lforma_ins.add(f);
		C.Dict_forma.get(f).add(this);
		ArrayList<Participant> L=  C.Dict_forma.get(f);
		C.Dict_forma.put(f, L);
		
	}
/*supprimer formation*/
	void supprimer_formation(formation f)
	{	for(int i=0;i<this.Adresse.size();i++)
			if (this.Lforma_ins.get(i)==f)
				this.Lforma_ins.remove(i);
	}
/*insérer les matiéres et leurs notes dans un dict*/
/*on crée un setter personnalisé de notes*/
	private Float setNote(Matiére m) {
		System.out.println("Veuillez entrer la note de la matiére:"+m.nom);
		Scanner scanner = new Scanner( System.in );
		float f=scanner.nextFloat();
		return f;
	}
	void fill_Bulletin()
	{
		for(formation f :Lforma_ins)
			for (Matiére m : f.Mat_inclue)
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
           System.out.println("matiére: "+mapentry.getKey().nom 
                              + " | note: " + mapentry.getValue());
        }
	}
/*implementer la méthode payer de l'interface*/
public float calculer_prix()
 {	float remise=0f;
 	float S=0f; 
 	for(formation f:this.Lforma_ins) 
 	{S=S+f.prix;}
 	return S;
 }
 public String toString()
 {String S="";formation f = null;

	 S="nom et prenom participant: "+this.nom+" "+this.prenom+" né le "+ this.date_naissence +" a pour statut:"+this.Status+" d'adresse :";
	 for (int i =0;i<Adresse.size();i++)
		 S=S+" "+Adresse.get(i);
	 S=S+"\n";
	 for (int i=0;i<Lforma_ins.size();i++)
		 f=Lforma_ins.get(i);
		 S=S+"formation :"+f.nom;
	 return S;
 }


}
