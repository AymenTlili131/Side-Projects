import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public class Section 
{
	int id ;
	String nom;
	Set<Matiére> PlanE; /*= new Set<Matiére>();*/
	Set<Etudiant> Etud;
	
	void fill_Etud() throws SQLException
	{
		{Etudiant p1=null;
		/*Statement statement = con.createStatement();*/
		PreparedStatement ps=Connexion.getConnection().prepareStatement("SELECT * FROM Etudiant Where Filliére like ?");
		ps.setString(1,"%"+this+"%");
		ResultSet result= ps.executeQuery();
		while (result.next())
		{
		Etudiant p=new Etudiant(result.getInt(1),result.getString(2),result.getString(3),this);
		p1=p;
		this.Etud.add(p1);
		}
		ps.close();
}
	}
	/*constructeur*/
	/*recherche etudiant par CIN ou nom et prénom*/
	public Section(int id, String nom) {
		this.id = id;
		this.nom = nom;
		try {
			fill_Etud();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void ajouter_Mat(Matiére M)
	{if (M!= null)
		PlanE.add(M);
	}
	void retirer_Mat(Matiére M) throws SQLException
	{if (M!= null)
		PlanE.remove(M);
	String request=
			"DELETE FROM Matiére WHERE id = ?";
	PreparedStatement ps=Connexion.getConnection().prepareStatement(request);
	ps.setLong(1,M.getId());
	ps.executeQuery();
	ps.close();
	}
	
	void ajouter_Etu(Etudiant e)
	{if (e!= null)
		Etud.add(e);
	}
	void retirer_Etu(Etudiant e) throws SQLException
	{if (e!= null)
		PlanE.remove(e);
	String request=
			"DELETE FROM Etudiant WHERE id = ?";
	PreparedStatement ps=Connexion.getConnection().prepareStatement(request);
	ps.setLong(1,e.getCin());
	ps.executeQuery();
	ps.close();
	
	
	}
	
	Etudiant rechercheETU(int a) throws SQLException
	{Etudiant k = null;
		for (Etudiant i : this.Etud)
			{if (i.cin==a)
				k=i;
			}
		PreparedStatement ps=Connexion.getConnection().prepareStatement("SELECT * FROM Etudiant Where Cin = ?");
		ps.setInt(1,k.cin);
		ResultSet result= ps.executeQuery();
		while (result.next())
		{
		Etudiant p=new Etudiant(result.getInt(1),result.getString(2),result.getString(3),this);
		k=p;
		}
		ps.close();
		return k;
		
		
		
		
		
	}
	Etudiant rechercheETU(String a , String b) throws SQLException
	{Etudiant k = null;
		for (Etudiant i : this.Etud)
			{if ((i.nom.equals(a)) && (i.prénom.equals(b)))
				k=i;
			}

		/*Statement statement = con.createStatement();*/
		PreparedStatement ps=Connexion.getConnection().prepareStatement("SELECT * FROM Etudiant Where Nom like ? And Prénom like ?");
		ps.setString(2,"%"+this+"%");
		ps.setString(3,"%"+this+"%");
		ResultSet result= ps.executeQuery();
		while (result.next())
		{
		Etudiant p=new Etudiant(result.getInt(1),result.getString(2),result.getString(3),this);
		k=p;
		}
		ps.close();
		return k;
	}

	@Override
	public String toString() {
		return "Section [id=" + id + ", nom=" + nom + ", PlanE=" + PlanE + "]";
	}
	
	
}