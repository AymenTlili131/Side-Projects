import java.sql.Connection;
import java.sql.DriverManager;
public class Connexion
{ /*public static void main(String[] args )*/
	
	/*afficher la BD*/
	private static Connexion con;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");/*tester si le driver est chargé et existe*/
			System.out.println("Driver ok");
			String url ="jdbc:mysql://localhost:3306/Historique";
			String user ="root";
			String pwd="";
			Connection con =DriverManager.getConnection(url, user, pwd);
			System.out.println("Connected ");
			}	
		catch (Exception e)
		{e.printStackTrace();	
		}
	}
	public static Connexion getConnection()
	{return con ;}
}


/*private static Connection con ;
static { try 
		{ Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver ok");
		Connection con =DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection OK ");
		}
		catch (Exception e) {e.printStackTrace();}
public static Connection getConnection()
{return con;}


}*/