import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Table {
	int T_rows;
	int T_columns;
	private String[] titre;
	ArrayList<Produit> L_produit = new ArrayList<Produit>();
	ArrayList<String> col_names = new ArrayList<String>();
	
	
	public Table(int t_rows, String[] titre) {
		this.T_rows = t_rows;
		this.titre = titre;
		this.T_columns =titre.length;
	}
	
	public Table(int t_rows, int t_columns) 
	{
		this.T_rows = t_rows;
		this.T_columns = t_columns;
	}
	
	String[][] CreateTable ()
	{	String[][] T=null;
	  for (int i = 0;i < this.T_rows; i++) {
	         for (int j = 0;j < this.T_columns;j++) {	
	           T[i][j]="";
	         }}
		return T;
	}
	/* remplir la liste des noms des colonnes si elle n'est pas passée en paramétre*/
	String[] check_titre()
	{	if (this.titre==null)
			continue ;
		else
		{
			SELECT COLUMN_NAME.
			FROM INFORMATION_SCHEMA.COLUMNS
			WHERE TABLE_NAME = 'Your Table Name'
			ORDER BY ORDINAL_POSITION
			
			
			this.titre = "ID","Libelle","Prix";}
	}
				
	void fill_Produit() throws SQLException
			{
				{Produit p1=null;
				/*Statement statement = con.createStatement();*/
				PreparedStatement ps=( Connexion.getConnection()).prepareStatement("SELECT * FROM Produit Where Filliére like ?");
				ps.setString(1,"%"+this+"%");
				ResultSet result= ps.executeQuery();
				while (result.next())
				{
				Produit p=new Produit(result.getInt(1),result.getString(2),result.getInt(3));
				p1=p;
				this.L_produit.add(p1);
				}
				ps.close();
		}
			}
	
	/*model*/
}
