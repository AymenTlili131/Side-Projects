import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Etudiant 
{ int cin;
String nom;String  pr�nom;
Section F;
HashMap<Mati�re,Float> Bulletin = new HashMap<Mati�re,Float>();
Float moyenne=0f;
/* constructeur */
/*fill bulletin */
/*calculer moyenne*/
public Etudiant(Section f)  
{/*int cin, String nom, String pr�nom, Section f*/
	this.cin = setCin();
	this.nom = setNom();
	this.pr�nom = setpr�nom();
	F = setF(f);
	F.ajouter_Etu(this);
	moyenne= this.calculer_moy();
	try {
		ajouter_BD();
	} catch (SQLException e) {
		e.printStackTrace();
	}
							
}

public Etudiant(int int1, String string, String string2, Section section) {
	this.cin = int1;
	this.nom = string;
	this.pr�nom = string2;
	F = section;
	F.ajouter_Etu(this);
	moyenne= this.calculer_moy();
	try {
		ajouter_BD();
	} catch (SQLException e) {
		e.printStackTrace();
	}
							
}

private String setpr�nom() {
	// TODO Auto-generated method stub
	return null;
}

void ajouter_BD() throws SQLException
{PreparedStatement ps=Connexion.getConnection().prepareStatement("insert into Etudiant values(?,?,?,?,?)");				
try {
ps.setInt(1,this.getCin());
ps.setString(2,this.getNom());
ps.setString(3,this.getPr�nom());
ps.setString(3,this.getPr�nom());
ps.setFloat(5,this.getMoyenne());
ps.executeQuery();  
}
catch (Exception e)
{e.printStackTrace();	
}
ps.close();
}
private Float setNote(Mati�re m) {
	System.out.println("Veuillez entrer la note de la mati�re:"+m.Nom);
	Scanner scanner = new Scanner(System.in);
	float f=scanner.nextFloat();
	return f;
}

void fill_Bulletin()
{
		for (Mati�re m : F.PlanE)
			Bulletin.put(m, setNote(m));
	
}
public float calculer_moy()
{float S = 0;float cof_t=0;
Mati�re aux0;float aux1;
for (Map.Entry<Mati�re,Float> a : Bulletin.entrySet()) 
{ 	aux0=  a.getKey(); 
	aux1=  a.getValue();
   S=S+ aux0.coef * ((float)aux1);
   cof_t=cof_t+ ((Mati�re)a.getKey()).coef;
}
return S/cof_t;
}
/*affichage bulletin*/
public void afficher_bulletin()
{
    for (Map.Entry<Mati�re,Float> mapentry : this.Bulletin.entrySet()) {
       System.out.println("mati�re: "+mapentry.getKey().Nom 
                          + " | note: " + mapentry.getValue()+" \n");
    }
}
/*getters & setters & toString*/
public int getCin() {
	return cin;
}
public int setCin() {
	   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	   System.out.println("Enter Cin");

	   int cin1 = (int) myObj.nextDouble();  // Read user input
	   System.out.println("Cin is: " + cin1 );  // Output user input
	return this.cin = cin1;
}
public String getNom() {
	return nom;
}
public String setNom() {
	   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	   System.out.println("Enter Nom");

	   String nom = myObj.nextLine();  // Read user input
	   System.out.println("Nom is: " + nom );  // Output user input
	return this.nom = nom;
}
public String getPr�nom() {
	return pr�nom;
}
public void setPr�nom() {
	   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	   System.out.println("Enter PRENom");

	   String nom = myObj.nextLine();  // Read user input
	   System.out.println("PRENom is: " + nom );  // Output user input
	this.pr�nom = nom;
}
public Section getF() {
	return F;
}
public Section setF(Section f) {
	this.F=f;
	return F ;
}
public HashMap<Mati�re, Float> getBulletin() {
	return Bulletin;
}
public void setBulletin() {
	fill_Bulletin();
}
public Float getMoyenne() {
	return this.calculer_moy();
}
public void setMoyenne(Float moyenne) {
	this.moyenne =this.calculer_moy();
}
@Override
public String toString() {
	return "Etudiant [cin=" + cin + ", nom=" + nom + ", pr�nom=" + pr�nom + ", moyenne=" + moyenne + "]";
}

Etudiant MettreAj(Etudiant p) throws SQLException 
{			
			PreparedStatement ps=Connexion.getConnection().prepareStatement("insert into Etudiant values(?,?,?,"+this.F+",?)");				
			try {
			ps.setInt(1,p.getCin());
			ps.setString(2,p.getNom());
			ps.setString(3,p.getPr�nom());
			ps.setFloat(5,p.getMoyenne());
			ps.executeQuery();  
			}
			catch (Exception e)
			{e.printStackTrace();	
			}
			ps.close();
			return p;
}


}
