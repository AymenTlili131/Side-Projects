import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Traitement 
{
	static Connection con=null;
	static { 
	try
	 { Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogue"
			 ,"root"
			, "");}
	 catch (Exception e)
		{e.printStackTrace();	
		}
	}
	Produit save(Produit p) throws SQLException 
	{			
				PreparedStatement ps=Connect.getConnection().prepareStatement("insert into produit values(?,?,?)");				
				try {
				ps.setInt(1,p.getId());
				ps.setString(1,p.getLibelle());
				ps.setDouble(3,p.getPrix());
				ps.executeQuery();  
				}
				catch (Exception e)
				{e.printStackTrace();	
				}
				ps.close();
				return p;
	}

	ArrayList<Produit> produitsParMC(String mc) throws SQLException
	{ 
		ArrayList<Produit> L = new ArrayList<Produit>();
			try{
				PreparedStatement ps=Connect.getConnection().prepareStatement("SELECT LIBELLE FROM Produit Where Libelle Like ?");
				ps.setString(2,"%"+mc+"%");
				ResultSet result= ps.executeQuery(); 
				while (result.next())
				{
				Produit p=new Produit(result.getInt(1),result.getString(2),result.getDouble(3));
				L.add(p);}
				}
				catch(Exception e)
				{e.printStackTrace();
				}
				return L;
	}

	Produit getProduit(Double id) throws SQLException
	{			Produit p1=null;
				/*Statement statement = con.createStatement();
				String request ="SELECT id FROM Produit Where id Like "+id;*/
				PreparedStatement ps=Connect.getConnection().prepareStatement("SELECT LIBELLE FROM Produit Where Libelle Like ?");
				ps.setString(1,"%"+id+"%");
				ResultSet result= ps.executeQuery();
				while (result.next())
				{
				Produit p=new Produit(result.getInt(1),result.getString(2),result.getDouble(3));
				p1=p;
				}
				ps.close();
				return p1;
	}

	Produit updateProduit(Produit P) throws SQLException 
	/*mise à jour à travers l'ID d'un produit .
	 * c'est le point commun entre le produit avant mise à jour et aprés */
	{String request=
	"UPDATE Produit SET libelle = ? ,prix = ? WHERE id = ?";
	PreparedStatement ps=Connect.getConnection().prepareStatement(request);
	ps.setString(2,P.getLibelle());
	ps.setLong(3,(long) P.getPrix() );
	ps.setLong(1,P.getId());
	ps.executeQuery();
	ps.close();
	return P;}
	
	Produit deleteProduit(Produit P) throws SQLException 
	{String request=
			"DELETE FROM Produit WHERE id = ?";
	PreparedStatement ps=Connect.getConnection().prepareStatement(request);
	ps.setLong(1,P.getId());
	ps.executeQuery();
	ps.close();
	return P;}
}
	
	