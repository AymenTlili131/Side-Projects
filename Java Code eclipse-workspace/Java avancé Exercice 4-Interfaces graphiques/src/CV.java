import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class CV {
	String Nom;
	String Pr?nom ;
	String Poste ;
	ArrayList<comp?tence> L_comp?tences =new ArrayList<comp?tence>();
	ArrayList<projets> L_Projets =new ArrayList<projets>();
	ArrayList<Stage> L_Stage =new ArrayList<Stage>();
	ArrayList<loisir> L_loisir =new ArrayList<loisir>();
	
	
	public CV(String nom, String pr?nom, String poste) {
		super();
		Nom = nom;
		Pr?nom = pr?nom;
		Poste = poste;
	}
	
	void ajouterComp?tence(comp?tence c)
	{if (L_comp?tences.size()<3)
		L_comp?tences.add(c);
	}
	void retirerComp?tence(comp?tence c)
	{
		L_comp?tences.remove(c);
	}
	
	void ajouterProjet(projets p)
	{if (L_Projets.size()<2)
		L_Projets.add(p);
	}
	void retirerProjet(projets p)
	{
		L_Projets.remove(p);
	}
	
	void ajouterStage(Stage s)
	{
		L_Stage.add(s);
	}
	void retirerStage(Stage s)
	{
		L_Stage.remove(s);
	}
	
	void ajouterloisir(loisir l)
	{if (L_loisir.size()<2)
		L_loisir.add(l);
	}
	void retirerloisir(loisir l)
	{
		L_loisir.remove( l);
	}
	
	
	
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPr?nom() {
		return Pr?nom;
	}

	public void setPr?nom(String pr?nom) {
		Pr?nom = pr?nom;
	}

	public String getPoste() {
		return Poste;
	}

	public void setPoste(String poste) {
		Poste = poste;
	}

	CV MettreAj(CV p) throws SQLException 
	{			
				PreparedStatement ps=Connexion.getConnection().prepareStatement("insert into CV values(?,?,?)");
				PreparedStatement ps_l=Connexion.getConnection().prepareStatement("insert into Loisir values(?,?)");	
				PreparedStatement ps_p=Connexion.getConnection().prepareStatement("insert into Projet values(?)");	
				PreparedStatement ps_s=Connexion.getConnection().prepareStatement("insert into Stage values(?,?,?,?)");
				PreparedStatement ps_c=Connexion.getConnection().prepareStatement("insert into Comp?tence values(?,?,?)");	
				try {

				ps.setString(1,p.getNom());
				ps.setString(2,p.getPr?nom());
				ps.setString(3,p.getPoste());
				
				
				for (loisir l : L_loisir)
				{ps_l.setString(1,l.getNom());
				ps_l.setInt(2,((Object) l).TempsParSemaine());}
				ps_l.executeQuery();  
				
				
				for (projets Projet : L_Projets)
				{ps_p.setString(1,Projet.getNom());}
				ps_p.executeQuery();  
				
				
				for (Stage s : L_Stage)
				{ps_s.setString(1,s.getNom());
				ps_s.setString(2,s.getEntreprise());
				ps_s.setInt(3,((Object) s).dur?eMois());
				ps_l.setInt(4,((Object) s).order());
				}
				ps.executeQuery();  
				
				for (comp?tence c : L_comp?tences)
				{ps_s.setString(1,c.getNom());
				ps_s.setInt(2,c.getMoisExperience());
				ps_s.setInt(3,((Object) c).type());
				}
				ps.executeQuery();  
				
				catch (Exception e)
				{e.printStackTrace();	
				}
				ps.close();
				return p;
	}

}
